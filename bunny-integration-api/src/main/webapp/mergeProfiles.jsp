<!DOCTYPE html>

<html lang="en">
<head>
<meta charset="UTF-8">
<title>Merge Profiles</title>
</head>
<body>
	<script>
		function myFunction() {
			var urlAuthLinked = '${urlAuthLinked}';
			console.log(urlAuthLinked);
			window.location.replace(urlAuthLinked);
		}
	</script>
	<br>
	<button id=mergeButton type="button" onclick="myFunction()">Enter App</button>
</body>
</html>