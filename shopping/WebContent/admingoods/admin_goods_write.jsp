<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>���θ�</title>
</head>
<body>
<form name="goodsform" action="./GoodsAddAction.ag" method="post" enctype="multipart/form-data">
<table width="960" cellpadding="0" cellspacing="0" border="0" color="gray" align="center">
	<input type="hidden" name="goods_best" value="0">
	<tr>
		<td>
			<p align="center">
				<span style="font-size: 26pt;">�� ǰ �� ��</span>
			</p>
		</td>
	</tr>
	<tr>
		<td height="331">
		<table border="1" align="center" width="558">
			<tr>
				<td width="196" height="30">
					<p align="center">
						<font size="2">ī�װ�</font>
					</p>
				</td>
				<td width="346" height="30">
					<select name="goods_category" size="1">
						<option value="outwear" selected>�ƿ�����</option>
						<option value="fulldress">����/�Ż纹</option>
						<option value="Tshirts">Ƽ����</option>
						<option value="pants">����</option>
						<option value="shoes">����</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>
					<p align="center"><font size="2">��ǰ�̸�</font></p>
				</td>
				<td><input type="text" name="goods_name"></td>
			</tr>
			<tr>
				<td>
					<p align="center"><font size="2">�ǸŰ�</font></p>
				</td>
				<td><input type="text" name="goods_price"></td>
			</tr>
			<tr>
				<td>
					<p align="center"><font size="2">����</font></p>
				</td>
				<td><input type="text" name="goods_color"></td>
			</tr>
			<tr>
				<td>
					<p align="center"><font size="2">����</font></p>
				</td>
				<td><input type="text" name="goods_amount"></td>
			</tr>
			<tr>
				<td>
					<p align="center"><font size="2">������</font></p>
				</td>
				<td><input type="text" name="goods_size"></td>
			</tr>
			<tr>
				<td widht="196">
					<p align="center"><font size="2">��ǰ����</font></p>
				</td>
				<td width="346">
					<textarea name="goods_content" cols="50" rows="15"></textarea>
				</td>
			</tr>
			<tr>
				<td><p align="center"><font size="2">���� ��ǰ�̹���(gif)</font></p></td>
				<td><input type="file" name="file4"></td>
			</tr>
			<tr>
				<td><p align="center"><font size="2">��ǰ �̹���1</font></p></td>
				<td><input type="file" name="file3"></td>
			</tr>
			<tr>
				<td><p align="center"><font size="2">��ǰ �̹���2</font></p></td>
				<td><input type="file" name="file2"></td>
			</tr>
			<tr>
				<td><p align="center"><font size="2">��ǰ �̹���3</font></p></td>
				<td><input type="file" name="file1"></td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td height="75">
		<p align="center"><input type="submit" value="���">&nbsp;
		<input type="reset" value="�ٽþ���"></p>
		</td>
	</tr>
	</table>
</form>
</body>
</html>