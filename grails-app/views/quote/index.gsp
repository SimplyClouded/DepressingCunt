<html>

<head>
	<meta name="layout" content="main"/>
</head>

<body>
<nav class="navbar navbar-inverse" role="navigation">
 <div class="container">
 	<ul class="nav navbar-nav">
 		 <li class="active"><a href="/">Home</a></li>
 		 <li><g:link url="about">About</g:link></li>
 	</ul>
 </div>
 </nav>
<div class="container">
	<div class="page-header">
		<h1 class="text-center"> Depressing Cunt</h1>
	</div>
	
	<div class="center">
		<blockquote>
			<p class="text-center"><em>${ quote.quote } </em> </p>
			<footer><cite title="Author">${ quote.author }</cite> (<g:formatDate format="dd/MM/yyyy" date="${quote.dateRecorded}"/>)</footer>
		</blockquote>
	</div>
</div>
</body>

</html>