var index = (function () {

    function saveData(user) {
        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/user",
            data: JSON.stringify(user)
        });
    }

    function getData() {
        $.get("/users", function (data) {
            putOnMainData(data[data.length-1]);
        });
    }

    function putOnMainData(data) {
        $("#mainHome").append("<div>Hola " + data.name + ". Esta es la página principal del formulario dinámico.<br/>" +
            "Muchas gracias por acceder.<br/>" +
            "Tu correo es " + data.email + "</div>");
    }

    return {
        submitForm: function () {
            $.get("/maxNextId", function (data) {
                saveData({
                    id: data,
                    name: $("#inputName").val(),
                    email: $("#inputCorreo").val(),
                    pwd: $("#inputPwd").val()
                });
            }).done(function () {
                window.location.href = "/home.html";
            });
        },
        showData: function () {
            getData();
        },
        goBack: function () {
            window.location.href = "/";
        }
    };

})();