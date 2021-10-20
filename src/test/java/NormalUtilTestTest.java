import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.jj.jejuTour.Tour.vo.TourVo;
import junit.framework.TestCase;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class NormalUtilTestTest extends TestCase {

    public void testGetJson() {

        /*
        //String json = "{\"result\":\"200\",\"resultMessage\":\"SUCCESS\",\"tour_place_explanation\":zz,\"resultCount\":100,\"pageSize\":100,\"pageCount\":12,\"currentPage\":1,\"items\":[{\"alltag\":\"4.3,문화유적지\",\"contentsid\":\"CNTS_000000000022850\",\"contentscd\":{\"123\":\" aaa\"},\"title\":\"현의합장묘역\",\"region1cd\":{\"value\":\"region2\",\"label\":\"서귀포시\",\"refId\":\"region>region2\"},\"region2cd\":{\"value\":\"25\",\"label\":\"남원\",\"refId\":\"region2>25\"},\"address\":\"제주특별자치도 서귀포시 남원읍 수망리 893\",\"roadaddress\":\"제주특별자치도 서귀포시 남원읍 중산간동로 6242-56\",\"tag\":\"4.3,문화유적지\",\"introduction\":\"‘의로운 영혼들이 함께 묻혀 있는 묘’라는 의미의 ‘현의합장묘(顯義合葬墓)’\",\"latitude\":33.350883,\"longitude\":126.69801,\"postcode\":\"63615\",\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"현의합장묘역\",\"photoid\":{\"photoid\":16733,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/1456c856-30fe-4796-be8d-bc68425712df.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/e4ce1d51-e5ee-402b-b21b-a3edfdffe131.jpg\"}}},{\"alltag\":\"친구,혼자,커플,휴식/힐링,올레\",\"contentsid\":\"CNTS_000000000021034\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"예초리\",\"region1cd\":{\"value\":\"region3\",\"label\":\"섬 속의 섬\",\"refId\":\"region>region3\"},\"region2cd\":{\"value\":\"32\",\"label\":\"추차도\",\"refId\":\"region3>32\"},\"address\":\"제주특별자치도 제주시 추자도 예초리\",\"roadaddress\":\"제주특별자치도 제주시 추자도 예초리\",\"tag\":\"친구,혼자,커플,휴식/힐링,올레\",\"introduction\":\"묵리, 신양 2리와 함께 하추자도에 위치한 마을\",\"latitude\":33.947014,\"longitude\":126.3201,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"예초리\",\"photoid\":{\"photoid\":10438,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/176e466e-2257-4fdf-a827-5a455166971b.gif\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/39457a76-11cb-4cb5-a0b8-14b0aee5be1d.gif\"}}},{\"alltag\":\"맑음,휴식/힐링,여름,해변,낚시\",\"contentsid\":\"CNTS_200000000007284\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"삼양방파제\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"11\",\"label\":\"제주시내\",\"refId\":\"region1>11\"},\"address\":\"제주 제주시 삼양3동\",\"roadaddress\":\"제주특별자치도 제주시 벌랑길\",\"tag\":\"맑음,휴식/힐링,여름,해변,낚시\",\"introduction\":\"삼양3동 포구에 위치한 방파제\",\"latitude\":33.5232424,\"longitude\":126.5764205,\"postcode\":null,\"phoneno\":null,\"repPhoto\":{\"descseo\":\"삼양방파제\",\"photoid\":{\"photoid\":2018052303095,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201807/26/241fa67f-9e0b-4afb-9422-206d1b538733.JPG\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201807/26/a33fd80b-8d35-40a2-9681-422130c78860.JPG\"}}},{\"alltag\":\"체험관광,아이,흐림,사계절\",\"contentsid\":\"CNTS_000000000022010\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"조수리 농어촌체험마을\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"14\",\"label\":\"한경\",\"refId\":\"region1>14\"},\"address\":\"제주특별자치도 제주시 한경면 조수리\",\"roadaddress\":\"제주특별자치도 제주시 한경면 조수리\",\"tag\":\"체험관광,아이,흐림,사계절\",\"introduction\":null,\"latitude\":33.337276,\"longitude\":126.22851,\"postcode\":null,\"phoneno\":\"064-773-1945\",\"repPhoto\":{\"descseo\":\"한경면 조수1리 농어촌체험마을\",\"photoid\":{\"photoid\":12390,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/2f25256d-557d-4adb-b235-1bb10ad700c1.png\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/c79a0df7-3a21-49cd-8c15-3014962f4824.png\"}}},{\"alltag\":\"4.3,문화유적지\",\"contentsid\":\"CNTS_000000000022868\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"불카분낭 (불타버린 나무)\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"15\",\"label\":\"조천\",\"refId\":\"region1>15\"},\"address\":\"제주특별자치도 제주시 조천읍 선흘리 1136-2\",\"roadaddress\":\"제주특별자치도 제주시 조천읍 선흘리 1136-2\",\"tag\":\"4.3,문화유적지\",\"introduction\":\"선흘리가 초토화되면서 같이 탔지만 지금껏 살아있는 나무\",\"latitude\":33.510834,\"longitude\":126.70725,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"불카분낭 (불타버린 나무)\",\"photoid\":{\"photoid\":16769,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/4fb1ddfc-8807-4d78-acfe-d69109727216.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/dd1ebc9a-6c31-4f1a-97a8-0782ae618789.jpg\"}}},{\"alltag\":\"문화유적지,맑음,아주 어려움\",\"contentsid\":\"CNTS_000000000021194\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"별도연대\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"11\",\"label\":\"제주시내\",\"refId\":\"region1>11\"},\"address\":\"제주특별자치도 제주시 화북1동 1537\",\"roadaddress\":\"제주특별자치도 제주시 화북1동 1537\",\"tag\":\"문화유적지,맑음\",\"introduction\":\"외적의 침입을 막던 별도연대\",\"latitude\":33.526237,\"longitude\":126.56813,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"별도연대\",\"photoid\":{\"photoid\":10840,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/75b64b15-5593-460d-8b9a-8742242c5c8f.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/616af32a-8c23-4ddb-b649-79a25592f191.jpg\"}}},{\"alltag\":\"문화유적지,휴식/힐링,가을\",\"contentsid\":\"CNTS_200000000007860\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"월라사\",\"region1cd\":{\"value\":\"region2\",\"label\":\"서귀포시\",\"refId\":\"region>region2\"},\"region2cd\":{\"value\":\"21\",\"label\":\"서귀포시내\",\"refId\":\"region2>21\"},\"address\":\"제주특별자치도 서귀포시 신효동 579-2\",\"roadaddress\":\"제주특별자치도 서귀포시 효돈순환로 415\",\"tag\":\"문화유적지,휴식/힐링,가을\",\"introduction\":\"서귀포시 신효동에 있는 사찰\",\"latitude\":33.2687804,\"longitude\":126.6101134,\"postcode\":null,\"phoneno\":\"064-767-0269\",\"repPhoto\":{\"descseo\":\"월라사\",\"photoid\":{\"photoid\":2018052308813,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201811/14/d7e84aa7-4505-4ba2-84be-351aad77e154.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201811/14/8f66dfc2-194d-4247-bcd0-086c66446104.jpg\"}}},{\"alltag\":\"해변,경관/포토,커플,혼자,맑음\",\"contentsid\":\"CNTS_000000000021033\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"예초리해변\",\"region1cd\":{\"value\":\"region3\",\"label\":\"섬 속의 섬\",\"refId\":\"region>region3\"},\"region2cd\":{\"value\":\"32\",\"label\":\"추차도\",\"refId\":\"region3>32\"},\"address\":\"제주특별자치도 제주시 추자면 예초리\",\"roadaddress\":\"제주특별자치도 제주시 추자면 예초리\",\"tag\":\"해변,경관/포토,커플,혼자,맑음\",\"introduction\":\"작은예초작지\",\"latitude\":33.95313,\"longitude\":126.33361,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"예초리해변\",\"photoid\":{\"photoid\":10429,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/6701657b-2f41-464b-bf63-f24f7dbb7b99.gif\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/e86764e7-5bdd-442a-be9e-5639f4393467.gif\"}}},{\"alltag\":\"4.3,문화유적지\",\"contentsid\":\"CNTS_000000000022865\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"삼밭구석 & 동광리4·3희생자위령비\",\"region1cd\":{\"value\":\"region2\",\"label\":\"서귀포시\",\"refId\":\"region>region2\"},\"region2cd\":{\"value\":\"23\",\"label\":\"안덕\",\"refId\":\"region2>23\"},\"address\":\"제주특별자치도 서귀포시 안덕면 동광리 1425 일대\",\"roadaddress\":\"제주특별자치도 서귀포시 안덕면 동광리 1425 일대\",\"tag\":\"4.3,문화유적지\",\"introduction\":\"4·3사건 당시 죽은 삼밧구석 주민들의 원혼을 달래기 위해 마을 출신 주민들이 직접 세운 비석\",\"latitude\":33.311443,\"longitude\":126.330444,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"삼밭구석 & 동광리4·3희생자위령비\",\"photoid\":{\"photoid\":16762,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/7cf03fab-f939-4c49-ac2d-3df6bf5e5589.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/b64e7450-b3be-4ac0-bac1-e51138ce4222.jpg\"}}},{\"alltag\":\"실내,문화유적지,흐림,맑음,사계절\",\"contentsid\":\"CNTS_000000000022068\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"백제사\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"12\",\"label\":\"애월\",\"refId\":\"region1>12\"},\"address\":\"제주시 애월읍 광령남6길 54 백제사\",\"roadaddress\":\"제주시 애월읍 광령남6길 54 백제사\",\"tag\":\"실내,문화유적지,흐림,맑음,사계절\",\"introduction\":\"자연친화적인 한국의 사찰문화를 체험할 수 있는 도량이다.\",\"latitude\":33.448807,\"longitude\":126.42422,\"postcode\":null,\"phoneno\":\"064-746-8009\",\"repPhoto\":{\"descseo\":\"백제사\",\"photoid\":{\"photoid\":12704,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/0b181426-b99f-4a34-a51d-7b8711057f40.png\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/a09336c6-88ad-400f-8cf9-d46665fea168.png\"}}},{\"alltag\":\"체험관광,아이,흐림,사계절\",\"contentsid\":\"CNTS_000000000022009\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"건강장수마을 산양리 농어촌체험마을\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"14\",\"label\":\"한경\",\"refId\":\"region1>14\"},\"address\":\"제주시 한경면 청수리 3256-3\",\"roadaddress\":\"제주시 한경면 중산간서로 3169\",\"tag\":\"체험관광,아이,흐림,사계절\",\"introduction\":\"건강한 밥상, 건강한 삶이 있는 건강장수마을\",\"latitude\":33.29395,\"longitude\":126.23304,\"postcode\":null,\"phoneno\":\"064-773-1950\",\"repPhoto\":{\"descseo\":\"건강장수마을 산양리 농어촌체험마을\",\"photoid\":{\"photoid\":12384,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/fb199b13-ca08-488d-a65c-25d4e3d38706.png\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/abea7a79-fd1e-4963-88aa-885eeddccc91.png\"}}}]}";
        String json = "{\"result\":\"200\",\"resultMessage\":\"SUCCESS\",\"totalCount\":1103,\"resultCount\":100,\"pageSize\":100,\"pageCount\":12,\"currentPage\":1,\"items\":[{\"alltag\":\"4.3,문화유적지\",\"contentsid\":\"CNTS_000000000022850\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"현의합장묘역\",\"region1cd\":{\"value\":\"region2\",\"label\":\"null\",\"refId\":\"region>region2\"},\"region2cd\":{\"value\":\"25\",\"label\":\"남원\",\"refId\":\"region2>25\"},\"address\":\"제주특별자치도 서귀포시 남원읍 수망리 893\",\"roadaddress\":\"제주특별자치도 서귀포시 남원읍 중산간동로 6242-56\",\"tag\":\"4.3,문화유적지\",\"introduction\":\"‘의로운 영혼들이 함께 묻혀 있는 묘’라는 의미의 ‘현의합장묘(顯義合葬墓)’\",\"latitude\":33.350883,\"longitude\":126.69801,\"postcode\":\"63615\",\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"현의합장묘역\",\"photoid\":{\"photoid\":16733,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/1456c856-30fe-4796-be8d-bc68425712df.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/e4ce1d51-e5ee-402b-b21b-a3edfdffe131.jpg\"}}},{\"alltag\":\"친구,혼자,커플,휴식/힐링,올레\",\"contentsid\":\"CNTS_000000000021034\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"예초리\",\"region1cd\":{\"value\":\"region3\",\"label\":\"섬 속의 섬\",\"refId\":\"region>region3\"},\"region2cd\":{\"value\":\"32\",\"label\":\"추차도\",\"refId\":\"region3>32\"},\"address\":\"제주특별자치도 제주시 추자도 예초리\",\"roadaddress\":\"제주특별자치도 제주시 추자도 예초리\",\"tag\":\"친구,혼자,커플,휴식/힐링,올레\",\"introduction\":\"묵리, 신양 2리와 함께 하추자도에 위치한 마을\",\"latitude\":33.947014,\"longitude\":126.3201,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"예초리\",\"photoid\":{\"photoid\":10438,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/176e466e-2257-4fdf-a827-5a455166971b.gif\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/39457a76-11cb-4cb5-a0b8-14b0aee5be1d.gif\"}}},{\"alltag\":\"맑음,휴식/힐링,여름,해변,낚시\",\"contentsid\":\"CNTS_200000000007284\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"삼양방파제\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"11\",\"label\":\"제주시내\",\"refId\":\"region1>11\"},\"address\":\"제주 제주시 삼양3동\",\"roadaddress\":\"제주특별자치도 제주시 벌랑길\",\"tag\":\"맑음,휴식/힐링,여름,해변,낚시\",\"introduction\":\"삼양3동 포구에 위치한 방파제\",\"latitude\":33.5232424,\"longitude\":126.5764205,\"postcode\":null,\"phoneno\":null,\"repPhoto\":{\"descseo\":\"삼양방파제\",\"photoid\":{\"photoid\":2018052303095,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201807/26/241fa67f-9e0b-4afb-9422-206d1b538733.JPG\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201807/26/a33fd80b-8d35-40a2-9681-422130c78860.JPG\"}}},{\"alltag\":\"체험관광,아이,흐림,사계절\",\"contentsid\":\"CNTS_000000000022010\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"조수리 농어촌체험마을\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"14\",\"label\":\"한경\",\"refId\":\"region1>14\"},\"address\":\"제주특별자치도 제주시 한경면 조수리\",\"roadaddress\":\"제주특별자치도 제주시 한경면 조수리\",\"tag\":\"체험관광,아이,흐림,사계절\",\"introduction\":null,\"latitude\":33.337276,\"longitude\":126.22851,\"postcode\":null,\"phoneno\":\"064-773-1945\",\"repPhoto\":{\"descseo\":\"한경면 조수1리 농어촌체험마을\",\"photoid\":{\"photoid\":12390,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/2f25256d-557d-4adb-b235-1bb10ad700c1.png\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/c79a0df7-3a21-49cd-8c15-3014962f4824.png\"}}},{\"alltag\":\"4.3,문화유적지\",\"contentsid\":\"CNTS_000000000022868\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"불카분낭 (불타버린 나무)\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"15\",\"label\":\"조천\",\"refId\":\"region1>15\"},\"address\":\"제주특별자치도 제주시 조천읍 선흘리 1136-2\",\"roadaddress\":\"제주특별자치도 제주시 조천읍 선흘리 1136-2\",\"tag\":\"4.3,문화유적지\",\"introduction\":\"선흘리가 초토화되면서 같이 탔지만 지금껏 살아있는 나무\",\"latitude\":33.510834,\"longitude\":126.70725,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"불카분낭 (불타버린 나무)\",\"photoid\":{\"photoid\":16769,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/4fb1ddfc-8807-4d78-acfe-d69109727216.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/dd1ebc9a-6c31-4f1a-97a8-0782ae618789.jpg\"}}},{\"alltag\":\"문화유적지,맑음,아주 어려움\",\"contentsid\":\"CNTS_000000000021194\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"별도연대\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"11\",\"label\":\"제주시내\",\"refId\":\"region1>11\"},\"address\":\"제주특별자치도 제주시 화북1동 1537\",\"roadaddress\":\"제주특별자치도 제주시 화북1동 1537\",\"tag\":\"문화유적지,맑음\",\"introduction\":\"외적의 침입을 막던 별도연대\",\"latitude\":33.526237,\"longitude\":126.56813,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"별도연대\",\"photoid\":{\"photoid\":10840,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/75b64b15-5593-460d-8b9a-8742242c5c8f.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/616af32a-8c23-4ddb-b649-79a25592f191.jpg\"}}},{\"alltag\":\"문화유적지,휴식/힐링,가을\",\"contentsid\":\"CNTS_200000000007860\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"월라사\",\"region1cd\":{\"value\":\"region2\",\"label\":\"서귀포시\",\"refId\":\"region>region2\"},\"region2cd\":{\"value\":\"21\",\"label\":\"서귀포시내\",\"refId\":\"region2>21\"},\"address\":\"제주특별자치도 서귀포시 신효동 579-2\",\"roadaddress\":\"제주특별자치도 서귀포시 효돈순환로 415\",\"tag\":\"문화유적지,휴식/힐링,가을\",\"introduction\":\"서귀포시 신효동에 있는 사찰\",\"latitude\":33.2687804,\"longitude\":126.6101134,\"postcode\":null,\"phoneno\":\"064-767-0269\",\"repPhoto\":{\"descseo\":\"월라사\",\"photoid\":{\"photoid\":2018052308813,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201811/14/d7e84aa7-4505-4ba2-84be-351aad77e154.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201811/14/8f66dfc2-194d-4247-bcd0-086c66446104.jpg\"}}},{\"alltag\":\"해변,경관/포토,커플,혼자,맑음\",\"contentsid\":\"CNTS_000000000021033\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"예초리해변\",\"region1cd\":{\"value\":\"region3\",\"label\":\"섬 속의 섬\",\"refId\":\"region>region3\"},\"region2cd\":{\"value\":\"32\",\"label\":\"추차도\",\"refId\":\"region3>32\"},\"address\":\"제주특별자치도 제주시 추자면 예초리\",\"roadaddress\":\"제주특별자치도 제주시 추자면 예초리\",\"tag\":\"해변,경관/포토,커플,혼자,맑음\",\"introduction\":\"작은예초작지\",\"latitude\":33.95313,\"longitude\":126.33361,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"예초리해변\",\"photoid\":{\"photoid\":10429,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/6701657b-2f41-464b-bf63-f24f7dbb7b99.gif\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/e86764e7-5bdd-442a-be9e-5639f4393467.gif\"}}},{\"alltag\":\"4.3,문화유적지\",\"contentsid\":\"CNTS_000000000022865\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"삼밭구석 & 동광리4·3희생자위령비\",\"region1cd\":{\"value\":\"region2\",\"label\":\"서귀포시\",\"refId\":\"region>region2\"},\"region2cd\":{\"value\":\"23\",\"label\":\"안덕\",\"refId\":\"region2>23\"},\"address\":\"제주특별자치도 서귀포시 안덕면 동광리 1425 일대\",\"roadaddress\":\"제주특별자치도 서귀포시 안덕면 동광리 1425 일대\",\"tag\":\"4.3,문화유적지\",\"introduction\":\"4·3사건 당시 죽은 삼밧구석 주민들의 원혼을 달래기 위해 마을 출신 주민들이 직접 세운 비석\",\"latitude\":33.311443,\"longitude\":126.330444,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"삼밭구석 & 동광리4·3희생자위령비\",\"photoid\":{\"photoid\":16762,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/7cf03fab-f939-4c49-ac2d-3df6bf5e5589.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/b64e7450-b3be-4ac0-bac1-e51138ce4222.jpg\"}}},{\"alltag\":\"실내,문화유적지,흐림,맑음,사계절\",\"contentsid\":\"CNTS_000000000022068\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"백제사\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"12\",\"label\":\"애월\",\"refId\":\"region1>12\"},\"address\":\"제주시 애월읍 광령남6길 54 백제사\",\"roadaddress\":\"제주시 애월읍 광령남6길 54 백제사\",\"tag\":\"실내,문화유적지,흐림,맑음,사계절\",\"introduction\":\"자연친화적인 한국의 사찰문화를 체험할 수 있는 도량이다.\",\"latitude\":33.448807,\"longitude\":126.42422,\"postcode\":null,\"phoneno\":\"064-746-8009\",\"repPhoto\":{\"descseo\":\"백제사\",\"photoid\":{\"photoid\":12704,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/0b181426-b99f-4a34-a51d-7b8711057f40.png\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/a09336c6-88ad-400f-8cf9-d46665fea168.png\"}}},{\"alltag\":\"체험관광,아이,흐림,사계절\",\"contentsid\":\"CNTS_000000000022009\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"건강장수마을 산양리 농어촌체험마을\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"14\",\"label\":\"한경\",\"refId\":\"region1>14\"},\"address\":\"제주시 한경면 청수리 3256-3\",\"roadaddress\":\"제주시 한경면 중산간서로 3169\",\"tag\":\"체험관광,아이,흐림,사계절\",\"introduction\":\"건강한 밥상, 건강한 삶이 있는 건강장수마을\",\"latitude\":33.29395,\"longitude\":126.23304,\"postcode\":null,\"phoneno\":\"064-773-1950\",\"repPhoto\":{\"descseo\":\"건강장수마을 산양리 농어촌체험마을\",\"photoid\":{\"photoid\":12384,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/fb199b13-ca08-488d-a65c-25d4e3d38706.png\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/abea7a79-fd1e-4963-88aa-885eeddccc91.png\"}}}]}";
        JsonParser Parser = new JsonParser();
        JsonObject jsonObj = (JsonObject) Parser.parse(json);
        JsonArray memberArray = (JsonArray) jsonObj.get("items");

        if (memberArray != null) { // Json 파일의 items null 체크
            List<TourVo> tourVoList = new ArrayList<>();

            for (int i = 0; i < memberArray.size(); i++) {
                TourVo tourVo = new TourVo();
                JsonObject memberArrayObject = (JsonObject) memberArray.get(i);

                //alltag
                String alltag = memberArrayObject.get("alltag").isJsonNull() ? "정보 없음" : memberArrayObject.get("alltag").toString();
                tourVo.setAlltag(alltag);

                //contentscd - label
                JsonObject contentscd = (JsonObject) memberArrayObject.get("contentscd");
                if( contentscd != null) {
                    if ((contentscd.get("label") != null)){
                        tourVo.setContentscd(contentscd.get("label").toString());
                    } else {
                        tourVo.setContentscd ("정보 없음");
                    }
                }

                //title
                String title = memberArrayObject.get("title").isJsonNull() ? "정보 없음" : memberArrayObject.get("title").toString();
                tourVo.setTitle(title);

                //region1cd - label
                JsonObject region1cd = (JsonObject) memberArrayObject.get("region1cd");
                if( region1cd != null) {
                    if ((region1cd.get("label") != null)){
                        tourVo.setRegion1cd(region1cd.get("label").toString());
                    } else {
                        tourVo.setRegion1cd ("정보 없음");
                    }
                }

                //address
                String address = memberArrayObject.get("address").isJsonNull() ? "정보 없음" : memberArrayObject.get("address").toString();
                tourVo.setAddress(address);

                //introduction
                String introduction = memberArrayObject.get("introduction").isJsonNull() ? "정보 없음" : memberArrayObject.get("introduction").toString();
                tourVo.setIntroduction(introduction);

                //latitude
                String latitude = memberArrayObject.get("latitude").isJsonNull() ? "정보 없음" : memberArrayObject.get("latitude").toString();
                tourVo.setLatitude(latitude);

                //longitude
                String longitude = memberArrayObject.get("longitude").isJsonNull() ? "정보 없음" : memberArrayObject.get("longitude").toString();
                tourVo.setLongitude(longitude);

                //longitude
                String phoneno = memberArrayObject.get("phoneno").isJsonNull() ? "정보 없음" : memberArrayObject.get("phoneno").toString();
                tourVo.setPhoneno(phoneno);

                //repPhoto - label
                JsonObject repPhoto = (JsonObject) memberArrayObject.get("repPhoto");
                System.out.println(repPhoto);
                if (repPhoto != null) {
                    JsonObject photoid = (JsonObject) repPhoto.get("photoid");
                    System.out.println("1" + photoid.get("imgpath"));
                    System.out.println("1" + photoid.get("thumbnailpath"));
                }


                tourVoList.add(tourVo);
            }
           for (TourVo tv : tourVoList) {
               try{
                   Object obj= tv;
                   for (Field field : obj.getClass().getDeclaredFields()){
                       field.setAccessible(true);
                       Object value=field.get(obj);
                       System.out.println(field.getName()+","+value);
                   }
               }catch (Exception e){
                   e.printStackTrace();
               }
           }
        }



        JsonElement element = JsonParser.parseString(json2);
        JsonObject object = element.getAsJsonObject();

        Gson gson = new Gson();
        TourVo student = gson.fromJson(object.toString(), TourVo.class);

        System.out.println(student.getTour_place_explanation());*/
/*
        try {


            String json = "{\"result\":\"200\",\"resultMessage\":\"SUCCESS\",\"totalCount\":1103,\"resultCount\":100,\"pageSize\":100,\"pageCount\":12,\"currentPage\":1,\"items\":[{\"alltag\":\"4.3,문화유적지\",\"contentsid\":\"CNTS_000000000022850\",\"contentscd\":{\"123\":\" aaa\"},\"title\":\"현의합장묘역\",\"region1cd\":{\"value\":\"region2\",\"label\":\"서귀포시\",\"refId\":\"region>region2\"},\"region2cd\":{\"value\":\"25\",\"label\":\"남원\",\"refId\":\"region2>25\"},\"address\":\"제주특별자치도 서귀포시 남원읍 수망리 893\",\"roadaddress\":\"제주특별자치도 서귀포시 남원읍 중산간동로 6242-56\",\"tag\":\"4.3,문화유적지\",\"introduction\":\"‘의로운 영혼들이 함께 묻혀 있는 묘’라는 의미의 ‘현의합장묘(顯義合葬墓)’\",\"latitude\":33.350883,\"longitude\":126.69801,\"postcode\":\"63615\",\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"현의합장묘역\",\"photoid\":{\"photoid\":16733,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/1456c856-30fe-4796-be8d-bc68425712df.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/e4ce1d51-e5ee-402b-b21b-a3edfdffe131.jpg\"}}},{\"alltag\":\"친구,혼자,커플,휴식/힐링,올레\",\"contentsid\":\"CNTS_000000000021034\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"예초리\",\"region1cd\":{\"value\":\"region3\",\"label\":\"섬 속의 섬\",\"refId\":\"region>region3\"},\"region2cd\":{\"value\":\"32\",\"label\":\"추차도\",\"refId\":\"region3>32\"},\"address\":\"제주특별자치도 제주시 추자도 예초리\",\"roadaddress\":\"제주특별자치도 제주시 추자도 예초리\",\"tag\":\"친구,혼자,커플,휴식/힐링,올레\",\"introduction\":\"묵리, 신양 2리와 함께 하추자도에 위치한 마을\",\"latitude\":33.947014,\"longitude\":126.3201,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"예초리\",\"photoid\":{\"photoid\":10438,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/176e466e-2257-4fdf-a827-5a455166971b.gif\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/39457a76-11cb-4cb5-a0b8-14b0aee5be1d.gif\"}}},{\"alltag\":\"맑음,휴식/힐링,여름,해변,낚시\",\"contentsid\":\"CNTS_200000000007284\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"삼양방파제\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"11\",\"label\":\"제주시내\",\"refId\":\"region1>11\"},\"address\":\"제주 제주시 삼양3동\",\"roadaddress\":\"제주특별자치도 제주시 벌랑길\",\"tag\":\"맑음,휴식/힐링,여름,해변,낚시\",\"introduction\":\"삼양3동 포구에 위치한 방파제\",\"latitude\":33.5232424,\"longitude\":126.5764205,\"postcode\":null,\"phoneno\":null,\"repPhoto\":{\"descseo\":\"삼양방파제\",\"photoid\":{\"photoid\":2018052303095,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201807/26/241fa67f-9e0b-4afb-9422-206d1b538733.JPG\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201807/26/a33fd80b-8d35-40a2-9681-422130c78860.JPG\"}}},{\"alltag\":\"체험관광,아이,흐림,사계절\",\"contentsid\":\"CNTS_000000000022010\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"조수리 농어촌체험마을\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"14\",\"label\":\"한경\",\"refId\":\"region1>14\"},\"address\":\"제주특별자치도 제주시 한경면 조수리\",\"roadaddress\":\"제주특별자치도 제주시 한경면 조수리\",\"tag\":\"체험관광,아이,흐림,사계절\",\"introduction\":null,\"latitude\":33.337276,\"longitude\":126.22851,\"postcode\":null,\"phoneno\":\"064-773-1945\",\"repPhoto\":{\"descseo\":\"한경면 조수1리 농어촌체험마을\",\"photoid\":{\"photoid\":12390,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/2f25256d-557d-4adb-b235-1bb10ad700c1.png\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/c79a0df7-3a21-49cd-8c15-3014962f4824.png\"}}},{\"alltag\":\"4.3,문화유적지\",\"contentsid\":\"CNTS_000000000022868\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"불카분낭 (불타버린 나무)\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"15\",\"label\":\"조천\",\"refId\":\"region1>15\"},\"address\":\"제주특별자치도 제주시 조천읍 선흘리 1136-2\",\"roadaddress\":\"제주특별자치도 제주시 조천읍 선흘리 1136-2\",\"tag\":\"4.3,문화유적지\",\"introduction\":\"선흘리가 초토화되면서 같이 탔지만 지금껏 살아있는 나무\",\"latitude\":33.510834,\"longitude\":126.70725,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"불카분낭 (불타버린 나무)\",\"photoid\":{\"photoid\":16769,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/4fb1ddfc-8807-4d78-acfe-d69109727216.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/dd1ebc9a-6c31-4f1a-97a8-0782ae618789.jpg\"}}},{\"alltag\":\"문화유적지,맑음,아주 어려움\",\"contentsid\":\"CNTS_000000000021194\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"별도연대\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"11\",\"label\":\"제주시내\",\"refId\":\"region1>11\"},\"address\":\"제주특별자치도 제주시 화북1동 1537\",\"roadaddress\":\"제주특별자치도 제주시 화북1동 1537\",\"tag\":\"문화유적지,맑음\",\"introduction\":\"외적의 침입을 막던 별도연대\",\"latitude\":33.526237,\"longitude\":126.56813,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"별도연대\",\"photoid\":{\"photoid\":10840,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/75b64b15-5593-460d-8b9a-8742242c5c8f.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/616af32a-8c23-4ddb-b649-79a25592f191.jpg\"}}},{\"alltag\":\"문화유적지,휴식/힐링,가을\",\"contentsid\":\"CNTS_200000000007860\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"월라사\",\"region1cd\":{\"value\":\"region2\",\"label\":\"서귀포시\",\"refId\":\"region>region2\"},\"region2cd\":{\"value\":\"21\",\"label\":\"서귀포시내\",\"refId\":\"region2>21\"},\"address\":\"제주특별자치도 서귀포시 신효동 579-2\",\"roadaddress\":\"제주특별자치도 서귀포시 효돈순환로 415\",\"tag\":\"문화유적지,휴식/힐링,가을\",\"introduction\":\"서귀포시 신효동에 있는 사찰\",\"latitude\":33.2687804,\"longitude\":126.6101134,\"postcode\":null,\"phoneno\":\"064-767-0269\",\"repPhoto\":{\"descseo\":\"월라사\",\"photoid\":{\"photoid\":2018052308813,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201811/14/d7e84aa7-4505-4ba2-84be-351aad77e154.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201811/14/8f66dfc2-194d-4247-bcd0-086c66446104.jpg\"}}},{\"alltag\":\"해변,경관/포토,커플,혼자,맑음\",\"contentsid\":\"CNTS_000000000021033\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"예초리해변\",\"region1cd\":{\"value\":\"region3\",\"label\":\"섬 속의 섬\",\"refId\":\"region>region3\"},\"region2cd\":{\"value\":\"32\",\"label\":\"추차도\",\"refId\":\"region3>32\"},\"address\":\"제주특별자치도 제주시 추자면 예초리\",\"roadaddress\":\"제주특별자치도 제주시 추자면 예초리\",\"tag\":\"해변,경관/포토,커플,혼자,맑음\",\"introduction\":\"작은예초작지\",\"latitude\":33.95313,\"longitude\":126.33361,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"예초리해변\",\"photoid\":{\"photoid\":10429,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/6701657b-2f41-464b-bf63-f24f7dbb7b99.gif\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/e86764e7-5bdd-442a-be9e-5639f4393467.gif\"}}},{\"alltag\":\"4.3,문화유적지\",\"contentsid\":\"CNTS_000000000022865\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"삼밭구석 & 동광리4·3희생자위령비\",\"region1cd\":{\"value\":\"region2\",\"label\":\"서귀포시\",\"refId\":\"region>region2\"},\"region2cd\":{\"value\":\"23\",\"label\":\"안덕\",\"refId\":\"region2>23\"},\"address\":\"제주특별자치도 서귀포시 안덕면 동광리 1425 일대\",\"roadaddress\":\"제주특별자치도 서귀포시 안덕면 동광리 1425 일대\",\"tag\":\"4.3,문화유적지\",\"introduction\":\"4·3사건 당시 죽은 삼밧구석 주민들의 원혼을 달래기 위해 마을 출신 주민들이 직접 세운 비석\",\"latitude\":33.311443,\"longitude\":126.330444,\"postcode\":null,\"phoneno\":\"--\",\"repPhoto\":{\"descseo\":\"삼밭구석 & 동광리4·3희생자위령비\",\"photoid\":{\"photoid\":16762,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/7cf03fab-f939-4c49-ac2d-3df6bf5e5589.jpg\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/b64e7450-b3be-4ac0-bac1-e51138ce4222.jpg\"}}},{\"alltag\":\"실내,문화유적지,흐림,맑음,사계절\",\"contentsid\":\"CNTS_000000000022068\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"백제사\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"12\",\"label\":\"애월\",\"refId\":\"region1>12\"},\"address\":\"제주시 애월읍 광령남6길 54 백제사\",\"roadaddress\":\"제주시 애월읍 광령남6길 54 백제사\",\"tag\":\"실내,문화유적지,흐림,맑음,사계절\",\"introduction\":\"자연친화적인 한국의 사찰문화를 체험할 수 있는 도량이다.\",\"latitude\":33.448807,\"longitude\":126.42422,\"postcode\":null,\"phoneno\":\"064-746-8009\",\"repPhoto\":{\"descseo\":\"백제사\",\"photoid\":{\"photoid\":12704,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/0b181426-b99f-4a34-a51d-7b8711057f40.png\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/a09336c6-88ad-400f-8cf9-d46665fea168.png\"}}},{\"alltag\":\"체험관광,아이,흐림,사계절\",\"contentsid\":\"CNTS_000000000022009\",\"contentscd\":{\"value\":\"c1\",\"label\":\"관광지\",\"refId\":\"contentscd>c1\"},\"title\":\"건강장수마을 산양리 농어촌체험마을\",\"region1cd\":{\"value\":\"region1\",\"label\":\"제주시\",\"refId\":\"region>region1\"},\"region2cd\":{\"value\":\"14\",\"label\":\"한경\",\"refId\":\"region1>14\"},\"address\":\"제주시 한경면 청수리 3256-3\",\"roadaddress\":\"제주시 한경면 중산간서로 3169\",\"tag\":\"체험관광,아이,흐림,사계절\",\"introduction\":\"건강한 밥상, 건강한 삶이 있는 건강장수마을\",\"latitude\":33.29395,\"longitude\":126.23304,\"postcode\":null,\"phoneno\":\"064-773-1950\",\"repPhoto\":{\"descseo\":\"건강장수마을 산양리 농어촌체험마을\",\"photoid\":{\"photoid\":12384,\"imgpath\":\"https://api.cdn.visitjeju.net/photomng/imgpath/201804/30/fb199b13-ca08-488d-a65c-25d4e3d38706.png\",\"thumbnailpath\":\"https://api.cdn.visitjeju.net/photomng/thumbnailpath/201804/30/abea7a79-fd1e-4963-88aa-885eeddccc91.png\"}}}]}";
            JsonElement element = JsonParser.parseString(json);
            JsonObject object = element.getAsJsonObject();

            JsonArray itemsArray = object.get("items").getAsJsonArray();
            for ( int i = 0; i <= itemsArray.size(); i++) {
                JsonObject items = itemsArray.get(i).getAsJsonObject();

                String alltag = String.valueOf(items).equals("null") ? "" : String.valueOf(items.getAsJsonPrimitive("alltag"));
                System.out.println("alltag " + alltag);

                JsonObject contentscd = items.isJsonNull() ? JsonNull.INSTANCE.getAsJsonObject() :  items.getAsJsonObject("contentscd");
                System.out.println("contentscd " + contentscd );
                String label = String.valueOf(contentscd).equals("null") ? "" : String.valueOf(contentscd.getAsJsonPrimitive("label"));
                System.out.println("label " + label );
                String title = String.valueOf(items.getAsJsonPrimitive("title"));
                System.out.println("title " + title );
                String roadaddress = String.valueOf(items.getAsJsonPrimitive("roadaddress"));
                System.out.println("roadaddress " + roadaddress );
                System.out.println("@@@@@ " + items.getAsString());

                String introduction = String.valueOf(items.getAsJsonPrimitive("introduction"));
                System.out.println("introduction " + introduction );

                String latitude = String.valueOf(items.getAsJsonPrimitive("latitude"));
                System.out.println("latitude " + latitude );
                String longitude = String.valueOf(items.getAsJsonPrimitive("longitude"));
                System.out.println("longitude " + longitude );

                String repPhoto = String.valueOf(items.getAsJsonObject("repPhoto"));*/
/*
                String photoid = String.valueOf(repPhoto.getAsJsonObject("photoid"));

                String imgpath = String.valueOf(photoid.getAsJsonPrimitive("imgpath"));
                System.out.println("imgpath " + imgpath );
                String thumbnailpath = String.valueOf(photoid.getAsJsonPrimitive("thumbnailpath"));
                System.out.println("thumbnailpath " + thumbnailpath );*/

                /*
                String alltag = String.valueOf(items).equals("null") ? "" : String.valueOf(items.getAsJsonPrimitive("alltag"));
                System.out.println("alltag " + alltag);
                JsonObject contentscd = items.getAsJsonObject("contentscd");

                JsonPrimitive label = contentscd.getAsJsonPrimitive("label");
                System.out.println("label " + label );
                JsonPrimitive title = items.getAsJsonPrimitive("title");
                System.out.println("title " + title );
                JsonPrimitive roadaddress = items.getAsJsonPrimitive("roadaddress");
                System.out.println("roadaddress " + roadaddress );
                JsonPrimitive introduction = items.getAsJsonPrimitive("introduction");
                System.out.println("introduction " + introduction );

                JsonPrimitive latitude = items.getAsJsonPrimitive("latitude");
                System.out.println("latitude " + latitude );
                JsonPrimitive longitude = items.getAsJsonPrimitive("longitude");
                System.out.println("longitude " + longitude );
                JsonPrimitive phoneno = items.getAsJsonPrimitive("phoneno");
                System.out.println("phoneno " + phoneno );

                JsonObject repPhoto = items.getAsJsonObject("repPhoto");

                JsonObject photoid = repPhoto.getAsJsonObject("photoid");

                JsonPrimitive imgpath = photoid.getAsJsonPrimitive("imgpath");
                System.out.println("imgpath " + imgpath );
                JsonPrimitive thumbnailpath = photoid.getAsJsonPrimitive("thumbnailpath");
                System.out.println("thumbnailpath " + thumbnailpath );


            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/



    }
}