/**
 * Created by Hoang Ta Duy on 10/15/2017.
 */
$(document).ready({

});

function ajax() {
    $.ajax({
        type: 'GET or POST',
        url: '',
        data: {},
        async: true,
        headers: {
            Accept: "application/json; charset=utf-8",
            "Content-Type": "application/json;charset=utf-8"
        },
        success: function (result) {
            var object = $.parseJSON(result);// nếu dữ liệu trả về là string có cấu trúc Json thì cần phải convert
        },
        error: function (e) {
            console.log("ERROR: ", e);
        }
    });
}