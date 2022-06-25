var API_URL = 'http://localhost:8080/api/v1/employees/';

function getParameterFromUrl(name){
    var url_string = window.location.href;
    var url = new URL(url_string);
    return url.searchParams.get(name);
}
