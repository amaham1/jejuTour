$(function (){
    $("#loginButton").click(function(){
        const loginType = $("input[name=login_type]:checked").val();
        const queryString = $("#loginForm").serialize();
        console.log(queryString);
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