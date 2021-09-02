$(function (){
    $("#loginButton").click(function(){
        const queryString = $("#loginForm").serialize();
        $.ajax({
            type: 'POST',
            url: '/cms/login',
            data: queryString,
            success: function () {

            }, error: function () {

            }
        })
    })

    $("#moveRegisterPage").click(function () {
        location.href="/cms/adminRegisterPage"
    })
})