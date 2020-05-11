var main = {

    init : function(){
        var _this = this;
        $('#btn-save').on('click',function(){
            _this.save();
        });
    },

    save : function(){
        var data = {
//            title : $('#title').val(),
//            author : $('#author').val(),
//            content : $('#contetn').val()
        };

        $.ajax({
            type: 'POST',
            url : '/posts',
            dataType: 'json',
            contentType:'application/json; charset=utf-8',
            data : JSON.stringify(data)
        }).done(function(){
            alert('Contents are enrolled!!')
            location.reload();
        }).fail(function(error){
            alert(error);
        });
    }
};

main.init();