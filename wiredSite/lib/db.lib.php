<?php
		try {
	$db = new PDO("mysql:host=localhost;dbname=wired","root","");
	$db->setAttribute(PDO::ATTR_DEFAULT_FETCH_MODE, PDO::FETCH_ASSOC);
	$db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_WARNING);
	} catch (PDOException $e) {
		die($e->getMessage());
	}
?>