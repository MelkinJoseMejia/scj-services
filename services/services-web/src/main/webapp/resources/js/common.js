function clearMap() {
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    wr._clearMap();
}

function drawProyectosMap(where) {
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    if(wr){
        wr.drawProyectosMapWhere(where);
    }
}

function zoomToGeometry(localizacion, localidad, upz) {
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    wr._zoomToGeometry(localizacion, localidad, upz);
}

function drawGeometries(idProyecto, codigoLocalidad){
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    wr._drawGeometries(idProyecto, codigoLocalidad);
}

function zoomToLocalidad(loccodigo) {
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    wr._zoomToLocalidad(loccodigo);
}

function zoomToGeometryTerri(capa, url, objectid, name) {
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    wr._zoomToGeometry(capa, url, objectid, name);
}

function zoomToGeometryTerriById(ubicacionId) {
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    wr._zoomToGeometryById(ubicacionId);
}

function removeUbicacionTerri(ubicacionId) {
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    wr._removeUbicacion(ubicacionId);
}

function updateUbicacionTerri(objectId, nombre) {
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    wr._updateUbicacion(objectId, nombre);
}

function executeUbicacionTerri(ubicacionId) {
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    wr._executeUbicacion(ubicacionId);
}

function activateDraw(activate) {
    var wr = document.getElementById('iFrameMap').contentWindow.widgetReference;
    wr._activateDraw(activate);
}

function showHideDiv(div) {
    var tabFiltros = document.getElementById("form:tabFiltros");
    var tabResultadosLocal = document.getElementById("form:tabResultadosLocal");

    switch (div) {
        case 'tabFiltros':
            tabFiltros.style.display = "block";
            tabResultadosLocal.style.display = "none";

            var btnFiltros = document.getElementById("btn-filtros");
            btnFiltros.classList.remove('btn-cabecera');
            btnFiltros.classList.add("btn-cabecera-select");
            var btnLocales = document.getElementById("btn-locales");
            btnLocales.classList.remove('btn-cabecera-select');
            btnLocales.classList.add("btn-cabecera");

            PF('bui').hide();
            break;
        case 'tabResultadosLocal':
            tabFiltros.style.display = "none";
            tabResultadosLocal.style.display = "block";

            var btnFiltros = document.getElementById("btn-filtros");
            btnFiltros.classList.remove('btn-cabecera-select');
            btnFiltros.classList.add("btn-cabecera");
            var btnLocales = document.getElementById("btn-locales");
            btnLocales.classList.remove("btn-cabecera");
            btnLocales.classList.add('btn-cabecera-select');

            PF('bui').hide();
            break;
    }
    return false;
}

function showStatusDialog() {
    PF('statusDialog').show();
}

function hideStatusDialog() {
    PF('statusDialog').hide();
}

function returnUrl(page) {
    window.location.href = page;
}

function getReturnValueLastProyecto() {
    getReturnValueLastProyectoCmd();
}

function getLayoutAreSelectedResult(xhr, status, args) {
    var returnedValue = args.returnedValue;
    if (returnedValue) {
        //zoomToGeometry(returnedValue.localizacion, returnedValue.codigoLocalidad, returnedValue.codigoUPZ);
    }
}