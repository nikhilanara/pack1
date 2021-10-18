<script>
    var $area = $(document),
        idleActions = [
            {
                milliseconds: 3000, // 3 seconds
                action: function () { alert('Warning'); }
            },
            {
                milliseconds: 3000, // 3 + 3 = 6 seconds
                action: function () { alert('Logout'); }
            }
        ];


    function Eureka (event, times, undefined) {
        var idleTimer = $area.data('idleTimer');
        if (times === undefined) times = 0;
        if (idleTimer) {
            clearTimeout($area.data('idleTimer'));
        }
        if (times < idleActions.length) {
            $area.data('idleTimer', setTimeout(function () {
                idleActions[times].action(); // run the first action
                Eureka(null, ++times); // setup the next action
            }, idleActions[times].milliseconds));
        } else {
            // final action reached, prevent further resetting
            $area.off('mousemove click', Eureka);
        }
    };

    $area
        .data('idle', null)
        .on('mousemove click', Eureka);

Eureka();

</script>