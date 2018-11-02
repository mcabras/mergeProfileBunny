<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Merge Profiles</title>
</head>
<body>
	<form id="formId" method="get" action="/merge">
	 	Trello Bio PersonId:
	 	<br>
		<input type="text" name="personId" id="personId">
		<br>
		<input type="hidden" name="code" id="code" value=${code}>
		<input type="submit" value="Merge profiles" />
	</form>
</body>
</html>