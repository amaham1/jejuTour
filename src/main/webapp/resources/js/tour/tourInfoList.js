$(document).ready(function () {
    var header = $("meta[name='_csrf_header']").attr("content");
    var token = $("meta[name='_csrf']").attr("content");

    $("#bbbtt").click(function () {
        $table.ajax.reload();
    })

    var $table = $("#d_table").DataTable({
        "serverSide" : true
        , "processing": true
        , "filter" : false
        , "lengthChange" : true
        , "paging" : true
        , "pagingType" : "full_numbers"
        , "language" : {
            "emptyTable" : "결과가 없습니다"
            , "lengthMent" : "_MENU_개 보기"
        }
        , "bLengthChange" : true
        , "lengthMenu" : [ [10, 20, 30], [10, 20, 30] ]
        , "order" : [[ 0, "desc" ]]
        , "searching" : false
        , ajax : {
            url: "./ajax/tourInfoList"
            , type: "POST"
            , beforeSend: function(xhr){
                    xhr.setRequestHeader(header, token);
                console.log("hhhhhi");}
            , data : function (res) {

                console.log(res)
            }
        }
        , "columns" : [
            { "data": "rownum"}
            , { "data": "title"}
            , { "data": "address"}
            , { "data": "introduction"}
            , { "data": "phoneno"}
            , { "data": "create_dt"}
            , { "data": "update_dt"}
        ]
    });

});