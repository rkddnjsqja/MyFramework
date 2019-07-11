/*
	javascript의 학술적 명칭: ECMAScript 2015클래스 지원
*/
class MyMarker{
	constructor(lati,longi,url,map,msg){
		this.lati=lati;
		this.longi=longi;
		this.url=url;
		this.map=map;
		this.msg=msg;
		this.marker = new google.maps.Marker({
			position:new google.maps.LatLng(lati,longi),
			animation:google.maps.Animation.BOUNCE,
			icon:{
				url:this.url,
				scaledSize: new google.maps.Size(50,55)
			}
		});		
		this.infowin = new google.maps.InfoWindow({
			content:this.msg	
		});
		
		//익명함수내에서 클래스의 멤버 변수를 접근하려면, 화살표 함수를 ㅣ용하면
		//된다~~
		google.maps.event.addListener(this.marker, "click", ()=> {
			this.infowin.open(this.map,this.marker);
		});
		this.marker.setMap(this.map);//맵에 마커 적용하기
	}
}