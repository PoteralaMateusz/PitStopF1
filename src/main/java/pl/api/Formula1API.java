package pl.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;

public class Formula1API {

    private final String apiStringURL;
    private StringBuffer apiJson = new StringBuffer();

    public Formula1API(String apiURL) {
        this.apiStringURL = apiURL;
        getJsonAPI();
    }

    private void getJsonAPI() {

        try {
            URL apiURL = new URL(apiStringURL);
            HttpURLConnection connection = (HttpURLConnection) apiURL.openConnection();
            connection.setRequestMethod("GET");

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK){
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                while ((inputLine = reader.readLine()) != null) {
                    apiJson.append(inputLine);
                }
                reader.close();
            }else {
                System.out.println("API CONNECTION ERROR: " + connection.getResponseCode());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
