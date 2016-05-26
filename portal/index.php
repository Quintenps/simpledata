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

        <div class="ui stackable grid">
  <div class="four column row">
    <div class="column">
      <div class="ui cube shape">
        <div class="sides">
          <div class="active side">
            <div class="content">
              <div class="center">
                <i class="alarm icon"></i>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="column">
     <div class="ui cube shape">
        <div class="sides">
          <div class="active side">
            <div class="content">
              <div class="center">
                <i class="protect icon"></i>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="column">
     <div class="ui cube shape">
        <div class="sides">
          <div class="active side">
            <div class="content">
              <div class="center">
                <i class="send icon"></i>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="column">
     <div class="ui cube shape">
        <div class="sides">
          <div class="active side">
            <div class="content">
              <div class="center">
                <i class="wizard icon"></i>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div class="four column stackable row">
    <div class="column">
      <div class="ui cube shape">
        <div class="sides">
          <div class="active side">
            <div class="content">
              <div class="center">
                <i class="cube icon"></i>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="column">
     <div class="ui cube shape">
        <div class="sides">
          <div class="active side">
            <div class="content">
              <div class="center">
                <i class="file text icon"></i>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="column">
     <div class="ui cube shape">
        <div class="sides">
          <div class="active side">
            <div class="content">
              <div class="center">
                <i class="database icon"></i>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

</div>

        



    </div>
<?php include 'includes/footer.php'; ?>
</body>
</html>