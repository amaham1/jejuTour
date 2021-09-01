$(function (){
    $("#adminRegister").click(function() {
        var queryString = $("#adminRegisterForm").serialize();
        $.ajax({
            type: 'POST',
            url: '/ajax/adminRegister',
            data: queryString,
            success: function (data) {
                if (data.resultCode === 200) {
                    alert("처리 생공")
                }
            },
            error: function () {
                alert("서버 오류")
            }
        });
    })
})