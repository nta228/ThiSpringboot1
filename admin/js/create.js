document.addEventListener('DOMContentLoaded', function () {
    var streetForm = document.forms['employee-form'];
    var btnSubmit = streetForm ['submit'];
    var textName = streetForm['name'];
    var textWage = streetForm['wage'];

    if (btnSubmit !== null && btnSubmit !== undefined) {
        btnSubmit.onclick = function (event) {
            if(streetForm.checkValidity()){ // gọi đến hàm validate của form
                event.preventDefault(); // ngăn việc form bị submit đi.
                // get data from form.
                var objData = {
                    name: textName.value,
                    district: textWage.value
                }
                postData(objData);
            }
        }
    }
})

function postData(objData) {
    var xmlHttpRequest = new XMLHttpRequest();
    xmlHttpRequest.onreadystatechange = function () {
        if (xmlHttpRequest.readyState == 4 && xmlHttpRequest.status == 200) {
            var jsonResponse = JSON.parse(xmlHttpRequest.responseText);
            alert('Action success');
            window.location.href = '/thispringboot/index.html';
        }
    }
    xmlHttpRequest.open('POST', API_URL);
    xmlHttpRequest.setRequestHeader('Content-Type', 'application/json'); // bắt buộc phải vị trí này
    xmlHttpRequest.send(JSON.stringify(objData));
}
