$(document).ready(()=>{

    $("#save").click(function(){
        var queryString = $("#TourInfoWrite").serialize();
        $.ajax({
            type: 'POST',
            url: '/cms/postTourInfo',
            data: queryString,
            success: function(data){
                if(data == true) {
                } else {
                    alert('처리에 실패하였습니다.')
                }

            },
            error: function(){
                alert("통신 오류");
            }
        });
    });
})