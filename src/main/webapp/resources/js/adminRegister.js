$(function (){

    $("#adminIdDupleCheck").click(function() {
        var admin_id = $("input#admin_id").val()
        $.ajax({
            type: 'POST',
            url: '/ajax/adminIdDupleCheck',
            data: {"admin_id" : admin_id},
            success: function (data) {
                if (data.result === true) {
                    alert("ID가 중복되었습니다")
                } else {
                    $("#adminIdDupleCheckFlag").val("pass");
                    alert("사용가능한 ID입니다")
                }
            }
        })
    })


    $("#adminRegister").click(function() {
        if ($("#adminIdDupleCheckFlag").val() === "pass"){
            var queryString = $("#adminRegisterForm").serialize();
            $.ajax({
                type: 'POST',
                url: '/ajax/adminRegister',
                data: queryString,
                success: function (data) {
                    if (data.resultCode === 200) {
                        alert("회원가입이 완료되었습니다")
                    }
                },
                error: function () {
                    alert("서버 오류")
                }
            });
        } else alert("ID 중복체크를 해주세요")

    })


})