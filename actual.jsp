<script>

(function () {
//    timedRefresh(10); //3600000
    delayedAlert();
    
    var timeoutID;

    function delayedAlert() {
      clearAlert();
      timeoutID = window.setTimeout(showAlert, 10000);
    }

    function showAlert() {
      alert("You may have been logged out due to inactivity. Click OK to refresh the page.");
    }

    function clearAlert() {
      window.clearTimeout(timeoutID);
    }
})();

</script>