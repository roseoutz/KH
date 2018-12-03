<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>쇼핑몰</title>
</head>
<body>
<form name="goodsform" action="./GoodsAddAction.ag" method="post" enctype="multipart/form-data">
<table width="960" cellpadding="0" cellspacing="0" border="0" color="gray" align="center">
	<input type="hidden" name="goods_best" value="0">
	<tr>
		<td>
			<p align="center">
				<span style="font-size: 26pt;">상 품 등 록</span>
			</p>
		</td>
	</tr>
	<tr>
		<td height="331">
		<table border="1" align="center" width="558">
			<tr>
				<td width="196" height="30">
					<p align="center">
						<font size="2">카테고리</font>
					</p>
				</td>
				<td width="346" height="30">
					<select name="goods_category" size="1">
						<option value="outwear" selected>아웃웨어</option>
						<option value="fulldress">정장/신사복</option>
						<option value="Tshirts">티셔츠</option>
						<option value="pants">팬츠</option>
						<option value="shoes">슈즈</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<p align="center"><font size="2">상품이름</font></p>
				</td>
				<td><input type="text" name="goods_name"></td>
			</tr>
			<tr>
				<td>
					<p align="center"><font size="2">판매가</font></p>
				</td>
				<td><input type="text" name="goods_price"></td>
			</tr>
			<tr>
				<td>
					<p align="center"><font size="2">색깔</font></p>
				</td>
				<td><input type="text" name="goods_color"></td>
			</tr>
			<tr>
				<td>
					<p align="center"><font size="2">수량</font></p>
				</td>
				<td><input type="text" name="goods_amount"></td>
			</tr>
			<tr>
				<td>
					<p align="center"><font size="2">사이즈</font></p>
				</td>
				<td><input type="text" name="goods_size"></td>
			</tr>
			<tr>
				<td widht="196">
					<p align="center"><font size="2">제품정보</font></p>
				</td>
				<td width="346">
					<textarea name="goods_content" cols="50" rows="15"></textarea>
				</td>
			</tr>
			<tr>
				<td><p align="center"><font size="2">메인 제품이미지(gif)</font></p></td>
				<td><input type="file" name="file4"></td>
			</tr>
			<tr>
				<td><p align="center"><font size="2">제품 이미지1</font></p></td>
				<td><input type="file" name="file3"></td>
			</tr>
			<tr>
				<td><p align="center"><font size="2">제품 이미지2</font></p></td>
				<td><input type="file" name="file2"></td>
			</tr>
			<tr>
				<td><p align="center"><font size="2">제품 이미지3</font></p></td>
				<td><input type="file" name="file1"></td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td height="75">
		<p align="center"><input type="submit" value="등록">&nbsp;
		<input type="reset" value="다시쓰기"></p>
		</td>
	</tr>
	</table>
</form>
</body>
</html>