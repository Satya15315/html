import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class InstagramProfileFetcher {
    public static void main(String[] args) {
        try {
            // Replace with your access token and user ID
            String accessToken = "YOUR_ACCESS_TOKEN";
            String userId = "YOUR_INSTAGRAM_USER_ID";

            String endpoint = "https://graph.instagram.com/" + userId +
                              "?fields=id,username,account_type,media_count" +
                              "&access_token=" + accessToken;

            URL url = new URL(endpoint);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            // Get the response
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            // Cleanup
            in.close();
            conn.disconnect();

            // Print the JSON result
            System.out.println("Instagram Profile Info:\n" + content.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

SJHJDBFCBJASXNJK
    ZJXHHASGCHADCBGASJXZ
    ;ZNXASHVASHXBDJAnxsaX?
Z'XASJHCDAHSSJUZ;
JDHUSAGDCYASGDCVGHYSAJXA
    ';ASNHCHASYCDHASJKZ
    
