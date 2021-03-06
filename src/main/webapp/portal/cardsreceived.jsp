<%@ page import="platform.User" %>
<%@ page import="dao.cardreceivedDAO" %>
<%@ page import="dao.datastoreDAO" %>
<%@ page import="dao.userDAO" %>
<%@ page import="java.util.*" %>
<%@ page import="dao.cardDAO" %>
<%@ page import="platform.CardAccess" %>
<!DOCTYPE html>
<html>
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0"
    name="viewport"><!-- Site Properties -->
    <title>DataBound :: Cards Received</title>
    <link href="../dist/components/reset.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/site.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/container.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/grid.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/header.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/image.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/button.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/shape.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/breadcrumb.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/label.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/form.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/card.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/label.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/modal.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/dimmer.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/transition.css" rel="stylesheet" type="text/css">


    <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=" crossorigin="anonymous"></script>
    <script src="../components/modal.js"></script>
    <script src="../components/transition.js"></script>
    <script src="../components/dimmer.js"></script>


    <link href="../dist/components/menu.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/divider.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/list.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/segment.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/dropdown.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/icon.css" rel="stylesheet" type="text/css">
    <link href="../dist/style.css" rel="stylesheet" type="text/css">

    <style type="text/css">
    body {
    background-color: #FFFFFF;
    }
    .ui.menu .item img.logo {
    margin-right: 1.5em;
    }
    .main.container {
    margin-top: 7em;
    }
    .wireframe {
    margin-top: 2em;
    }
    .ui.footer.segment {
    margin: 5em 0em 0em;
    padding: 5em 0em;
    }
    </style>
</head>
<body class="Site">
<jsp:include page="includes/menu.jsp" />
<main class="Site-content">
    <div class="ui main container">

        <div class="ui grid">
            <div class="four wide column">
                <div class="ui breadcrumb">
                    <a href="/portal/index.jsp" class="section">Home</a>
                    <div class="divider">
                        /
                    </div><a class="active section">Cards Received</a>
                </div>
            </div>
        </div>
<br /><br />
        <div class='ui massive middle aligned divided list'>
        <%
            User person = (User)session.getAttribute("loggedUser");
            int uid = (Integer) session.getAttribute("uid");

            cardreceivedDAO cardreceiveddao = new cardreceivedDAO();
            cardDAO carddao = new cardDAO();
            userDAO userdao = new userDAO();


            ArrayList<CardAccess> ca = cardreceiveddao.cardAccess(uid);

            for(CardAccess item : ca) {

                HashMap<Integer, String> carddata = carddao.selectAllDataByUID(item.getUid(), item.getCardname());
                String name = userdao.getName(item.getUid());

                out.println(" <div class='item'> <div class='right floated content'> <div class='ui orange label'>ID#"+item.getUid()+"</div><a class='ui blue label' id='"+name+item.getCardname()+"'><i class='arrow down icon'></i> "+item.getCardname()+"</a></div>");
                out.println("<img class='ui avatar image' src='"+userdao.getAvatarURL(item.getUid())+"'> <div class='content'>"+name+"</div></div>");
                out.println("<div class=\"ui modal\" id="+name+item.getCardname()+">\n" +
                        "  <i class=\"close icon\"></i>\n" +
                        "  <div class=\"header\">\n" +
                        "    "+name+"'s "+ item.getCardname() +"\n" +
                        "  </div>\n" +
                        "  <div class=\"image content\">\n" +
                        "    <div class=\"description\">\n" +
                        "<div class=\"ui list\">\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"user icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Name:</h5 >\n" +
                        "      "+carddata.get(1)+ " " +carddata.get(2)+ " " +carddata.get(3)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"heterosexual icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Gender:</h5 >\n" +
                        "      "+carddata.get(4)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"birthday icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Birthday:</h5 >\n" +
                        "      "+carddata.get(5)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"flag icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Nationality:</h5 >\n" +
                        "      "+carddata.get(6)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"location arrow icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Locations:</h5 >\n" +
                        "      "+carddata.get(7)+", "+carddata.get(8)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"facebook icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Facebook:</h5 >\n" +
                        "      "+carddata.get(9)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"twitter icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Twitter:</h5 >\n" +
                        "      "+carddata.get(10)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"skype icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Skype:</h5 >\n" +
                        "      "+carddata.get(11)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"mail icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Email personal:</h5 >\n" +
                        "      "+carddata.get(12)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"suitcase icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Email Business:</h5 >\n" +
                        "      "+carddata.get(13)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "  <div class=\"item\">\n" +
                        "    <i class=\"cloud icon\"></i>\n" +
                        "    <div class=\"content\"><h5> Website:</h5 >\n" +
                        "      "+carddata.get(14)+"\n" +
                        "    </div>\n" +
                        "  </div>\n" +

                        "</div>\n" +
                        "    </div>\n" +
                        "  </div>\n" +
                        "</div>");
            }

            Object headermsg = request.getAttribute("headermsg");
            Object bodymsg = request.getAttribute("bodymsg");


        %>

<script>
$(".blue").click(function(){
    var thisCard = $(this).attr('id');
    console.log(this);
    $('.modal#'+thisCard+'').modal('show');
});
</script>

</div>
        



    </div>
</main>
<jsp:include page="includes/footer.jsp" />
</body>
</html>