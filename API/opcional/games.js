$(document).ready(function(res){
    $("img").click(function clikeo(){
        var b=$(this).attr("id");
        $.get("https://anapioficeandfire.com/api/houses/"+b+"", function(res){
            console.log(res);
            $("#name").html("<p><span>Name:</span> "+res.name+"</p>");
            $("#words").html("<p><span>Words:</span> "+res.words+"</p>");
            $("#titles").html("<p><span>Titles:</span> "+res.titles+"</p>");
        });
    });
});
