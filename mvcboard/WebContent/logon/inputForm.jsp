<%@ page language="java" contentType="text/html; charset=euc-kr"
    pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="color.jspf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>ȸ������</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
    function execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // �˾����� �˻���� �׸��� Ŭ�������� ������ �ڵ带 �ۼ��ϴ� �κ�.

                // �� �ּ��� ���� ��Ģ�� ���� �ּҸ� �����Ѵ�.
                // �������� ������ ���� ���� ��쿣 ����('')���� �����Ƿ�, �̸� �����Ͽ� �б� �Ѵ�.
                var fullAddr = ''; // ���� �ּ� ����
                var extraAddr = ''; // ������ �ּ� ����

                // ����ڰ� ������ �ּ� Ÿ�Կ� ���� �ش� �ּ� ���� �����´�.
                if (data.userSelectedType === 'R') { // ����ڰ� ���θ� �ּҸ� �������� ���
                    fullAddr = data.roadAddress;

                } else { // ����ڰ� ���� �ּҸ� �������� ���(J)
                    fullAddr = data.jibunAddress;
                }

                // ����ڰ� ������ �ּҰ� ���θ� Ÿ���϶� �����Ѵ�.
                if(data.userSelectedType === 'R'){
                    //���������� ���� ��� �߰��Ѵ�.
                    if(data.bname !== ''){
                        extraAddr += data.bname;
                    }
                    // �ǹ����� ���� ��� �߰��Ѵ�.
                    if(data.buildingName !== ''){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // �������ּ��� ������ ���� ���ʿ� ��ȣ�� �߰��Ͽ� ���� �ּҸ� �����.
                    fullAddr += (extraAddr !== '' ? ' ('+ extraAddr +')' : '');
                }

                // �����ȣ�� �ּ� ������ �ش� �ʵ忡 �ִ´�.
                document.getElementById('zipcode').value = data.zonecode; //5�ڸ� �������ȣ ���
                document.getElementById('address1').value = fullAddr;

                // Ŀ���� ���ּ� �ʵ�� �̵��Ѵ�.
                document.getElementById('address2').focus();
            }
        }).open();
    }
</script>
<script language="javascript">
function checkIt() {
    var userinput = eval("document.userinput");
    if(!userinput.id.value) {
        alert("ID�� �Է��ϼ���");
        return false;
    }
    
    if(!userinput.passwd.value ) {
        alert("��й�ȣ�� �Է��ϼ���");
        return false;
    }
    if(userinput.passwd.value != userinput.passwd2.value)
    {
        alert("��й�ȣ�� �����ϰ� �Է��ϼ���");
        return false;
    }
   
    if(!userinput.username.value) {
        alert("����� �̸��� �Է��ϼ���");
        return false;
    }
    if(!userinput.jumin1.value  || !userinput.jumin2.value )
    {
        alert("�ֹε�Ϲ�ȣ�� �Է��ϼ���");
        return false;
    }
}   
function openConfirmid(userinput) {
	if (userinput.id.value == "") {
		alert("���̵� �Է��ϼ���");
		return;
	}
	url = "/mvcboard/logon/confirmId.do?id=" + userinput.id.value ;
	open(url, "confirm", "toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=550, height=200");
    }
</script>
</head>
<body bgcolor="${bodyback_c }">

<form method="post" action="/mvcboard/logon/inputPro.do" name="userinput" onsubmit="return checkIt()">
<table width="600" border="1" cellspacing="0" cellpadding="3" align="center">
	<tr>
		<td colspan="2" height="39" align="center" bgcolor="${value_c } ">
		<font size="+1"><b>ȸ������</b></font>
		</td>
	</tr>
	<tr>
		<td width="200" bgcolor="${value_c }"><b>���̵� �Է�</b></td>
		<td width="400" bgcolor="${value_c }">&nbsp;</td>
	</tr>
	<tr>
		<td width="200">�����</td>
		<td width="400">
		<input type="text" name="id" size="10" maxlength="12">
		<input type="button" name="confirm_id" value="ID�ߺ�Ȯ��" OnClick="openConfirmid(this.form)">
		</td>
	</tr>
	<tr>
		<td width="200">��й�ȣ</td>
		<td width="400">
		<input type="password" name="passwd" size="15" maxlength="12">
		</td>
	</tr>
	<tr>
		<td width="200">��й�ȣ Ȯ��</td>
		<td width="400">
		<input type="password" name="passwd2" size="15" maxlength="12">
		</td>
	</tr>
	
	<tr>
		<td width="200" bgcolor="${value_c }"><b>�������� �Է�</b></td>
		<td width="400" bgcolor="${value_c }">&nbsp;</td>
	</tr>
	<tr>
		<td width="200">������̸�</td>
		<td width="400">
			<input type="text" name="name" size="15" maxlength="10">
		</td>
	</tr>
	<tr>
		<td width="200">�ֹε�Ϲ�ȣ</td>
		<td width="400">
		<input type="text" name="jumin1" size="7" maxlength="6">
		<input type="text" name="jumin2" size="7" maxlength="7">
		</td>
	</tr>
	<tr>
		<td width="200">�ּ�</td>
		<td width="400">
		<input type="text" id="zipcode" name="zipcode" placeholder="�����ȣ">
		<input type="button" onclick="execDaumPostcode()" value="�����ȣ ã��"><br>
		<input type="text" id="address1" name="address1" placeholder="�ּ�">
		<input type="text" id="address2" name="address2" placeholder="���ּ�">
	</tr>
	<tr>
		<td width="200">Email</td>
		<td width="400">
		<input type="text" name="email" size="40" maxlength="30">
	</tr>
	<tr>
		<td width="200">Blog</td>
		<td width="400">
		<input type="text" name="blog" size="60" maxlength="50">
	</tr>
	<tr>
		<td colspan="2" align="center" bgcolor="${value_c }">
		<input type="submit" name="confirm" value="��   ��" >
        <input type="reset" name="reset" value="�ٽ��Է�">
        <input type="button" value="���Ծ���" onclick="document.location.href='/mvcboard/logon/main.do'">
        </td>
	</tr>
</table>
</form>
</body>
</html>