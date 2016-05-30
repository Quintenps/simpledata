<!DOCTYPE html>
<html>
<head>
    <!-- Standard Meta -->
    <meta charset="utf-8">
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0"
    name="viewport"><!-- Site Properties -->
    <title>Simple Data</title>
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


    <link href="../dist/components/menu.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/divider.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/list.css" rel="stylesheet" type="text/css">
    <link href="../dist/components/segment.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/dropdown.css" rel="stylesheet" type=
    "text/css">
    <link href="../dist/components/icon.css" rel="stylesheet" type="text/css">
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
<body>
<?php include 'includes/menu.php'; ?>
    <div class="ui main container">

        <div class="ui grid">
            <div class="four wide column">
                <div class="ui breadcrumb">
                    <a class="section">Home</a>
                    <div class="divider">
                        /
                    </div><a class="active section">Dashboard</a>
                </div>
            </div>
        </div>
<br /><br />
<div class="ui link centered cards">

  <div class="card">
    <div class="image">
      <img src="images/friendscard.jpg">
    </div>
    <div class="content">
      <div class="header">Personal card</div>
      <div class="meta">
        <span class="date">Used for friends</span>
      </div>
    </div>
    <div class="extra content">
      <span class="right floated">
        Last edit: 2 may 2016
      </span>
      <span>
        <i class="unhide icon"></i>
        35 shares
      </span>
    </div>
  </div>

  <div class="card">
    <div class="image">
      <img src="images/businesscard.jpg">
    </div>
    <div class="content">
      <div class="header">Business card</div>
      <div class="meta">
        <a>Used for business</a>
      </div>
    </div>
    <div class="extra content">
      <span class="right floated">
        Last edit: 9 may 2016
      </span>
      <span>
        <i class="unhide icon"></i>
        75 shares
      </span>
    </div>
  </div>

  <div class="card">
    <div class="image">
      <img src="images/publiccard.jpg">
    </div>
    <div class="content">
      <div class="header">Public Card</div>
      <div class="meta">
        <a>Used for unknown people</a>
      </div>
    </div>
    <div class="extra content">
      <span class="right floated">
        Last edit: 25 may 2016
      </span>
      <span>
        <i class="unhide icon"></i>
        151 shares
      </span>
    </div>
  </div>
</div>
</div>
        



    </div>
<?php include 'includes/footer.php'; ?>
</body>
</html>