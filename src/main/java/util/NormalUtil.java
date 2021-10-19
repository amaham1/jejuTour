package util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.net.HttpURLConnection;

public class NormalUtil {
    HttpURLConnection conn;

    public void getJson() {

        try {
            String json = "{\"result\":\"200\",\"resultMessage\":\"SUCCESS\",\"totalCount\":1,\"resultCount\":1,\"pageSize\":100,\"pageCount\":1,\"currentPage\":1,\"items\":[{\"alltag\":\"일출,오름,경관/포토,부모,공용주차장,현금결제,카드결제,화장실,무료 WIFI,편의점,음료대,유도 및 안내시설,경보 및 피난시설,임산부 휴게시설,장애인 화장실,장애인 전용 주차장,아주 어려움,UNESCO 세계자연유산,UNESCO 세계지질공원,실외,상,등산,산책로. 올레코스. 오름,1시간 미만\",\"contentsid\":\"CONT_000000000500349\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"성산일출봉(UNESCO 세계자연유산)\",\"region1cd\":{\"value\":\"region2\",\"label\":\"서귀포시\",\"refId\":\"region>region2\"},\"region2cd\":{\"value\":\"17\",\"label\":\"성산\",\"refId\":\"region2>17\"},\"address\":\"제주특별자치도 서귀포시 성산읍 성산리 1\",\"roadaddress\":\"제주특별자치도 서귀포시 성산읍 일출로 284-12\",\"tag\":\"일출,오름,경관/포토,부모\",\"introduction\":\"바다위에 우뚝 솟아난 수성화산·유네스코 세계자연유산, 천연기념물 제420호, 올레1코스\",\"latitude\":33.462147,\"longitude\":126.936424,\"postcode\":\"63643\",\"phoneno\":\"064-783-0959\",\"repPhoto\":{\"descseo\":\"성산일출봉(UNESCO 세계자연유산)\",\"photoid\":{\"photoid\":2018052306801,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201810/17/c072ee1a-2a02-4be7-b0cd-62f4daf2f847.gif\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201810/17/e798d53c-1c8a-4d44-a8ab-111beae96db4.gif\"}}}]}";
            JsonElement element = JsonParser.parseString(json);
            JsonObject object = element.getAsJsonObject();

            JsonArray studentsJsonArray = object.get("items").getAsJsonArray();
            JsonObject qqq = studentsJsonArray.get(0).getAsJsonObject();
            System.out.println("qqq " + qqq);
            JsonObject qwe = qqq.getAsJsonObject("contentscd");
            System.out.println("qwe " + qwe);
            String qq1 = qwe.getAsJsonPrimitive("label").toString();
            System.out.println("qq1 " + qq1);
            /*for (int i = 0; i < studentsJsonArray.size(); i++) {
                String student = studentsJsonArray.get(i).getAsString();
                System.out.println("items[" + i + "] : " + student);
            }*/

            /*
            URL url = new URL("https://api.visitjeju.net/vsjApi/contents/searchList?apiKey=w7ajt3gnrtev7nbe&locale=kr&cid=CONT_000000000500349");
            conn = (HttpURLConnection)url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line = "";
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }


                responseJson = new JSONObject(sb.toString());
                System.out.println("======" + responseJson);
                br.close();




                String name = element.getAsJsonObject().get("name").getAsString();

                int age = element.getAsJsonObject().get("age").getAsInt();



                JSONArray items = responseJson.getJSONArray("items");
                System.out.println("items  " + items);

                for (int i = 0; i <= items.length(); i++) {
                    String address = items.getJSONObject(i).getString("address");
                    String latitude = items.getJSONObject(i).getString("latitude");
                    String repPhoto = items.getJSONObject(i).getString("repPhoto");


                    System.out.println("address  " + repPhoto);
                }


            } */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
