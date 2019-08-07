
'use strict';
$(document).ready(function () {
    var theGameHasStarted = false;

    $(".boundary").mouseover(function () {
        if (theGameHasStarted) {
            $('.boundary').addClass('youlose');
            theGameHasStarted = false;
            $('#status').text("You Lose!");
        }

    });

    $('#start').click(function () {
        theGameHasStarted = true;
    });
    $('#end').click(function () {
        theGameHasStarted = false;
       $('#status').text("You Win!");
    });
})