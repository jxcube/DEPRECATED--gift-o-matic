/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var express = require('express');
var router = express.Router();
var db = require('../models');
var target = "\"holy\", \"holy\", \"holy\", \"holy\"";
var tags = [$target];
var totaltags = $tags.length;
var indexTag = 0;
var testing = tags[indexTag];
while (indexTag < totaltags) {    
    db.find({
        where: Sequelize.or(
                { tags[0] : [target] },
        {$tags: [$indexTag]}
        )
    });
    indexTag++;
}
console.log(indexTag);