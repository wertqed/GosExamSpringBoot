<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello</title>
</head>
<body>
    <div>Hello ${name}</div>

    <form method="POST" enctype="multipart/form-data"
          action="/upload">
        File to upload: <input type="file" name="file"><br /> Name: <input
            type="text" name="name"><br /> <br /> <input type="submit"
                                                         value="Upload"> Press here to upload the file!
    </form>
</body>
</html>