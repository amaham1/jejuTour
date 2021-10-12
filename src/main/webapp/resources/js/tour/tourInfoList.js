$(document).ready(function () {
    $.fn.cmsDataTable = function (init) {
        var setting = {
            "filter" : false,
            "lengthChange" : true,
            "paging" : true,
            "pagingType" : "full_numbers",
            "language" : {
                "emptyTable": "검색결과가 없습니다.",
                "lengthMenu" : "_MENU_ 개 보기",
            },
            "bLengthChange": true, // n개씩보기
            "lengthMenu" : [ [10, 20, 30], [10, 20, 30] ], // 10/20/30 개씩보기
            "order": [[ 0, "desc" ]],
            "searching" : false,
        };
        var val = $.extend(true, setting, init);
        //$.extend(val.language, setting.language , init.language);
        return $(this).DataTable(val);
    };

    $('#dataTbl').cmsDataTable({
        columnDefs: [
            { orderable: false, className: 'not-sort', targets: 0 },
            { orderable: false, className: '', targets: 1 },
            { orderable: false, className: '', targets: 2 },
        ],
    });
    
})