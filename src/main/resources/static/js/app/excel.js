var excel ={

    init : function(){
        var _this = this;


        $('.contentsLoad').on('click',function(){
            _this.load();

        });
    },

    load : function(){
        $('#panel').empty();
        var templ =  `<div>버튼클릭시 나오는 내용 추가예정..  </div>`;
        $(templ).appendTo('#panel');


        $.get('excelNewVersion',param,function(data){
            var param ={
                 FileVersion :"1.0"
            }

            console.log(data);
            var jsonData = data;
//            $('#panel').appendTo(jsonData);
        });
    }

};


excel.init();