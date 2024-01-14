/*global document,window,localStorage */
// var myHeading = document.querySelector('h1');

// myHeading.textContent = 'Be Kind';


var catImage = document.querySelector('img');

catImage.onclick = function () {
    'use strict';
    var myImages = catImage.getAttribute('src');
    if (myImages === ('images/busra-salkim-eoP3HNJfqw8-unsplash.jpg')) {
        catImage.setAttribute('src', 'images/nobiur-rahman-8u0Msm5ougM-unsplash.jpg');
    } else {
        catImage.setAttribute('src', 'images/busra-salkim-eoP3HNJfqw8-unsplash.jpg');
    }
};

//Personalized welcome message code

var nameButton = document.querySelector('button');
var myHeading = document.querySelector('h1');

function setUserName() {
    'Use strict';
    var myName = window.prompt('Please enter your name.');
    localStorage.setItem('name', myName);
    myHeading.textContent = 'Have a nice day,' + myName;
}

if (!localStorage.getItem('name')) {
    setUserName();
} else {
    var storedName = localStorage.getItem('name');
    myHeading.textContent = 'Have a nice day.' + storedName;
}

nameButton.onclick = function () {
    'use strict';
    setUserName();
};