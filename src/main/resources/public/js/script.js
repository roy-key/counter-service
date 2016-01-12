
var createCounter = function(){

    initExceptionBox();
    $.ajax({
 	    url: 'counters',
  		type: 'POST',
  		success: function(data) {
            handleResponse(data);
  		},
  		error: function(e) {
		    $('#exceptions').val(e.responseJSON.responseObject.errorMessage);
  		}
	});

}

var addToCounter = function(){

    initExceptionBox();
    if($('#CID').val() == ''){
        $('#exceptions').val("Please fill the ID in the CounterId box");
    }
    else{
        $.ajax({
            url: 'counters/' + $('#CID').val() + '/add',
            type: 'POST',
            success: function(data) {
                handleResponse(data);
            },
            error: function(e) {
                $('#exceptions').val(e.responseJSON.responseObject.errorMessage);
            }
        });
	}
}

var subtractFromCounter = function(){

    initExceptionBox();
    if ($('#CID').val() == ''){
            $('#exceptions').val("Please fill the ID in the CounterId box");
    }
    else {
        $.ajax({
            url: 'counters/' + $('#CID').val() + '/subtract',
            type: 'POST',
            success: function(data) {
                handleResponse(data);
            },
            error: function(e) {
                $('#exceptions').val(e.responseJSON.responseObject.errorMessage);
            }
        });
    }
}

var getCounterDetails = function(){

    initExceptionBox();
    if ($('#CID').val() == ''){
        $('#exceptions').val("Please fill the ID in the CounterId box");
    }
    else {
        $.ajax({
            url: 'counters/' + $('#CID').val(),
            type: 'GET',
                success: function(data) {
                        handleResponse(data);
                },
                error: function(e) {
                    $('#exceptions').val(e.responseJSON.responseObject.errorMessage);
                }
        });
    }
}

var getAllCounters = function(){

    initExceptionBox();
    $.ajax({
        url: 'counters',
  		type: 'GET',
  		success: function(data) {
            handleGetAllResponse(data);
        },
  		error: function(e) {
		    $('#exceptions').val(e.responseJSON.responseObject.errorMessage);
  		}
  	});
}

var handleResponse = function(data){

    $('#CValue').val(data.responseObject.counterValue);
    $('#CID').val(data.responseObject.id);

}

var handleGetAllResponse = function(data){

    var arr = [];
    var responseArr = data.responseObject.counterResponseList;
    var arrLength = responseArr.length;

    for (i = 0; i < arrLength; i++) {
        arr.push(responseArr[i].id);
	}

    $('#AID').val(arr.join(", "));

}

var initExceptionBox = function(){

    $('#exceptions').val('');

}