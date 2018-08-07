package com.shiv.poojan.RestAPITest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;

public class RestAPITest {
	protected static String baseURL;

	protected static String restURL;

	private static int timeout = 5 * 60 * 1000;

	protected JSONObject result;

	static {
		try {
			final Properties prop = new Properties();
			prop.load(new FileInputStream("config" + File.separator + "config.properties"));
			baseURL = prop.getProperty("app.url");
			restURL = baseURL + "/ml-rest-services/v1";
		} catch (final IOException ex) {
			ex.printStackTrace();
		}
	}

	public JSONObject callGetUrlWithJsonObject(final String url)
			throws ClientProtocolException, IOException, JSONException {
		CloseableHttpClient httpClient = HttpClients.createDefault();

		JSONObject jsonObject;

		HttpGet request = new HttpGet(url);
		request.addHeader("content-type", "application/json");
		HttpResponse response = httpClient.execute(request);
		Assert.assertEquals(202, response.getStatusLine().getStatusCode());

		final BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
		String output = "";
		String str;
		while ((str = br.readLine()) != null) {
			output += str;
		}

		jsonObject = new JSONObject(output);

		return jsonObject;
	}
}