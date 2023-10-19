const express = require('express');
var app = require('express')();

app.use(express.static('public'));
app.listen(8080, () => console.log('Servidor iniciado en 8080'));