


# oltest.html
getMap - getFeatureInfo - getMap 의 총 3번의 요청
(전체레이어 - 클릭한 곳의 정보 - 클릭한 곳의 레이어)
모두 지오서버 이용.



# oltest2.html
getMap - getFeatureInfo 의 총 2번의 요청
(전체레이어 - 클릭한 곳의 정보)
가지고 온 정보를 GeoJSON으로 파싱하여 지도에 그려줌.
모두 지오서버 이용.


# oltest3.html
지도를 클릭하면 포인트 좌표를 서버에 보내고,
그 좌표를 검색하여 시군구 레이어를 지도에 뿌려줌.
전체레이어는 지오서버 클릭한 곳의 정보와 geom은 spring boot이용.



### 개발 할 떄 필요한 설정
* cors 문제를 해결하기 위해서 지오서버 관련 web.xml에 cors관련 주석을 해제해 주어야 한다.

* 또한 spring boot에서도 다른 클라이언트에서 요청을 보내기때문에 filter처리를 해줘야 하는데 처리를 한 부분은 spring boot폴더에서 filter>CorsFilter.java 이다.


### 부족한 부분 
* oltest.html에서 마지막 요청 보낼시의 url을 더 간단하게 적을 수 있는지 더 알아봐야 한다. 요청을 보낼 때 어떤 형식을 지켜야하는지 꼭 보내야 하는 파라미터는 어떤 것인지 알아봐야 한다.# oltest
