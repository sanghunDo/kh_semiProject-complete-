<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<%@ page import="java.util.*, semi.board.rank.model.vo.*" %>

<%
	List<Rank> list = (List<Rank>)request.getAttribute("list");
%>

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/board/rank/ranking.css" />
<link href="https://fonts.googleapis.com/css?family=Abril+Fatface|East+Sea+Dokdo|Fredericka+the+Great|Noto+Serif+KR|Permanent+Marker" rel="stylesheet">

	<h2>BEST 3</h2>
	<div id="top3">
		<div id="top1-container">
			<%if(list == null || list.isEmpty()) { %>
				<span id="none">랭크에 기록된 결과가 없습니다.</span>
			<% } for(Rank r : list) {
					if(r.getPlayno() == 1) { %>
			<div id="first">				 
				<p id="label-for-grade">1st</p>
				<!-- 유저 프로필 이미지 시작 -->
				
				<%if(r.getUserprofilerenamedfile() == null || r.getUserprofilerenamedfile().isEmpty()) { %>
					<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Antu_im-user-offline.svg/512px-Antu_im-user-offline.svg.png"
						 style="width : 120px; height : 120px; margin-top : -115px; margin-left : 140px;"/>
				<%}
					else {%>
					
				<% } %>
				
				<!-- 유저 프로필 이미지 끝 -->
			</div>
			
			<p class="playerInfo"><%=r.getGameId() %></p>
			<p class="playerInfo"><%=r.getEndRuntime()%></p>
			<p class="playerInfo"><%=r.getGameescapedate()%></p>
			
			<%}} %>
		</div>
		
		<div id="top2-container">
			<%if(list == null || list.isEmpty()) { %>
				<span id="none">랭크에 기록된 결과가 없습니다.</span>
			<% } for(Rank r : list) {
					if(r.getPlayno() == 2) { %>
			<div id="second">
				<p id="label-for-grade">2nd</p>
				   
				<!-- 유저 프로필 이미지 시작 -->
				
				<%if(r.getUserprofilerenamedfile() == null || r.getUserprofilerenamedfile().isEmpty()) { %>
					<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Antu_im-user-offline.svg/512px-Antu_im-user-offline.svg.png"
						 style="width : 120px; height : 120px; margin-top : -115px; margin-left : 140px;"/>
				<%}
					else {%>
					
				<% } %>
				
				<!-- 유저 프로필 이미지 끝 -->
			</div>
			
			<p class="playerInfo"><%=r.getGameId() %></p>
			<p class="playerInfo"><%=r.getEndRuntime()%></p>
			<p class="playerInfo"><%=r.getGameescapedate()%></p>
			
			<%}} %>
		</div>
		
		<div id="top3-container">
			<%if(list == null || list.isEmpty()) { %>
				<span id="none">랭크에 기록된 결과가 없습니다.</span>
			<% } for(Rank r : list) {
					if(r.getPlayno() == 3) { %>
			<div id="third">				 
				<p id="label-for-grade">3rd</p>
				   
				<!-- 유저 프로필 이미지 시작 -->
				
				<%if(r.getUserprofilerenamedfile() == null || r.getUserprofilerenamedfile().isEmpty()) { %>
					<img src="https://upload.wikimedia.org/wikipedia/commons/thumb/0/04/Antu_im-user-offline.svg/512px-Antu_im-user-offline.svg.png"
						 style="width : 120px; height : 120px; margin-top : -115px; margin-left : 140px;"/>
				<%}
					else {%>
					
				<% } %>
				
				<!-- 유저 프로필 이미지 끝 -->
			</div>
			
			<p class="playerInfo"><%=r.getGameId() %></p>
			<p class="playerInfo"><%=r.getEndRuntime()%></p>
			<p class="playerInfo"><%=r.getGameescapedate()%></p>
			
			<%}} %>
	</div>
	
	<div id="from4to10">
		<!-- 4등부터 10등까지의 테이블은 AJAX 사용하기! -->
		<table id="tbl-Rank4-10">
			<tr>
				<th>등수</th>
				<th>아이디</th>
				<th>클리어 시간</th>
				<th>클리어 날짜</th>
			</tr>
			
			<% if(list == null || list.isEmpty()) { %>
			
			<tr>
				<td colspan="4" align="center">
				아직 랭크에 기록된 결과가 없습니다.
				</td>
			</tr>
			<%}
			else {
				for(Rank r : list) {
			%>
			<tr>
				<!-- AJAX 사용 해야함! -->
				<td><%=r.getPlayno()%></td>
				<td><%=r.getGameId()%></td>
				<td><%=r.getEndRuntime()%></td>
				<td><%=r.getGameescapedate()%></td>
			</tr>
			<% }}%>
		</table>
	</div>
	
	<!-- 댓글 시작  -->
	<div id="reply-container">
		<h2>Reply</h2>
		<p>* 비방 및 욕설, 도배글 등은 관리자에 의해 삭제될 수 있으니 주의하시길 바랍니다. *</p>
		<div id="reply">
			
		</div>
		
	</div>
	<!-- 댓글 끝 -->

<%@ include file="/WEB-INF/views/common/footer.jsp" %>