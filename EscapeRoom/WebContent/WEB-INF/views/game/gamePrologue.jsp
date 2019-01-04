<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>ESCAPE, IF YOU CAN.</title>
<script src="<%=request.getContextPath()%>/js/jquery-3.3.1.js"></script>
<link href="https://fonts.googleapis.com/css?family=Song+Myung" rel="stylesheet">
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/game/gamePrologue.css" />
<script>
window.onload=function(){
	window.focus();
	window.moveTo(0,0);
	window.resizeTo(1024,768);
}
</script>
</head>
<body>
<div id="warning">
	<h1>! WARNING !</h1><br />
	<p>본 게임은 다소 잔인하거나 불쾌한 장면이 포함되어 있을 수 있습니다.<br><br>
	   노약자, 어린이, 임산부이신 분들께는 게임 플레이를 권장하지 않습니다.<br><br>
	   또한, 장시간 플레이 후에는 휴식을 취해주시기 바랍니다.<br><br>
	   - 게임의 등장인물이나 배경은 모두 실제 인물이나 단체와 무관합니다. -</p>
</div>
<div id="prologue">
	<img src="" alt="" />
	<div id="msgBox">
		<div><h2></h2></div>
	</div>
</div>
<script>
	setTimeout(function(){
		$("#prologue").fadeIn(1000);
	}, 5000);
	
	$("#prologue").on('click', {cnt:0} ,function(e){
		var cnt = e.data.cnt++;
		var target = $("#prologue").find("h2");
		$.ajax({
			url:"<%=request.getContextPath()%>/game/prologue",
			data: "index="+cnt,
			type: "get",
			dataType: "json",
			success: function(data){
				target.removeAttr("style");
				$("#prologue").find("img").attr("src", data.fileName);
				target.text(data.content);
				target.parent().css("width",target.outerWidth());
				var length = data.content.length;
				target.attr("style", "animation:typing "+(length/40)+"s steps("+length+", end)");
			}
		});
	});
</script>
</body>
</html>