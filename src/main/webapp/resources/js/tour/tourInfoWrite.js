$(document).ready(()=>{

    $("#save").click(function(){
        console.log("ㄱㄱ")
        var queryString = $("#TourInfoWrite").serialize();
        $.ajax({
            type: 'POST',
            url: '/cms/postTourInfo',
            data: queryString,
            success: function(data){
                if(data.resultCode === 200) {
                    alert('처리에 성공하였습니다.')
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