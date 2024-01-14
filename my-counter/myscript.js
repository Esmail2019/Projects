function getTimeRemaining(endtime) {
    var t = Date.parse(endtime) - Date.parse(new Date());
    var seconds = Math.floor((t / 1000) % 60);
    var minutes = Math.floor((t / 1000) % 60);
    var hours = Math.floor((t / 1000) % 60);
    var days = Math.floor((t / 1000) % 60);
    return {
        'total': t,
        'days': days,
        'hours': hours,
        'minutes': minutes,
        'second': seconds
    };
    function intializeClock(id, endtime) {
        var clock = document.getElementById(id);
        var daysSpan = clock.getElementById('.days');
        var hourSpan = clock.getElementById('.hours');
        var minutesSpan = clock.getElementById('.minutes');
        var secondsSpan = clock.getElementById('.seconds');

        function updateClock() {
            var t = getTimeRemaining(endtime);

            daysSpan.innerHTML = t.days;
            hoursSpan.innerHTML = ('0' + t.hours).slice(-2);
            minutesSpan.innerHTML = ('0' + t.minutes).slice(-2);
            secondsSpan.innerHTML = ('0' + t.seconds).slice(-2);


            if (t.total <= 0) {
                clearInterval(timeinterval);
            }
        }

        updateClock();
        var timeinterval = setInterval(updateClock, 1000);

    }

    var deadline = new Date(Date.parse(new Date()) + 7 * 24 * 60 * 60 * 1000);
    intializeClock('clockdiv', deadline);
}

