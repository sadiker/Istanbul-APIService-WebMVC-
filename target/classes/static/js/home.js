
var ibbMAP = new SehirHaritasiAPI({ mapFrame: "mapFrame", apiKey: "" }, function () {
    ibbMAP.Map.GetLocation(function (lon, lat) {
        console.info(lon + " " + lat);
    });
});

function bigger () {
document.getElementById("map").style.height="750px"
}

function smaller () {
document.getElementById("map").style.height="500px"
}

