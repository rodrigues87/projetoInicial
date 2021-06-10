
var localizacao = new Object();

navigator.geolocation.getCurrentPosition(function(position) {
    lat = position.coords.latitude;
    long = position.coords.longitude;

    localizacao.latitude = lat;
    localizacao.longitude = long;

    console.log(localizacao);

    sendLocalizacao();
});

function sendLocalizacao(){

    $.ajax({
        url: "/localizacao/",
        method:"post",
        contentType: 'application/json',
        dataType: 'json',
        data: JSON.stringify(localizacao),
        success: function(data) {
            console.log(data)
        },
        error: function(ts) {
            console.log(ts.responseText)
        }
    });

}