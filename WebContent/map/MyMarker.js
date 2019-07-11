/*
	javascript�� �м��� ��Ī: ECMAScript 2015Ŭ���� ����
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
		
		//�͸��Լ������� Ŭ������ ��� ������ �����Ϸ���, ȭ��ǥ �Լ��� �ӿ��ϸ�
		//�ȴ�~~
		google.maps.event.addListener(this.marker, "click", ()=> {
			this.infowin.open(this.map,this.marker);
		});
		this.marker.setMap(this.map);//�ʿ� ��Ŀ �����ϱ�
	}
}