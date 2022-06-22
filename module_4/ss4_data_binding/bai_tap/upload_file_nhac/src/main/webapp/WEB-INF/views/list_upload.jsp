<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<h2>Danh sách bài hát</h2>

<form:form modelAttribute="upload" method="post" action="/home/update">
    <table border="1">
        <div>
            <tr>
                <td>Tên bài hát</td>
                <td>Nghệ sĩ thể hiện</td>
                <td>Thể loại nhạc</td>
                <td>ĐƯờng dẫn file bài hát</td>
                <td></td>
            </tr>
        </div>
        <div>
            <tr>
                <td><form:input path="nameSong"/></td>
                <td><form:input path="nameSinger"/></td>
                <td>
                    <form:select path="categorySong">
                        <form:option value="Mời chọn thể loại nhạc">Mời chọn thể loại nhạc</form:option>
                        <form:option value="POP">POP</form:option>
                        <form:option value="ROCK">ROCK</form:option>
                        <form:option value="Trữ tình">Trữ tình</form:option>
                    </form:select>
                </td>
                <td>
                    <form:select path="fileSong">
                        <form:option
                                value="https://www.nhaccuatui.com/bai-hat/tung-thuong-phan-duy-anh-ft-acv.1iieLFxqIrys.html">Từng Thương</form:option>
                        <form:option
                                value="https://www.nhaccuatui.com/bai-hat/hai-muoi-hai-22-hua-kim-tuyen-ft-amee.kvyyApgfnHC3.html">hai mươi hai</form:option>
                        <form:option
                                value="https://www.nhaccuatui.com/bai-hat/yeu-em-hon-moi-ngay-andiez.pIoFBkhDBqiw.html">Yêu em hơn mỗi ngày</form:option>
                        <form:option
                                value="https://www.nhaccuatui.com/bai-hat/heaven-calum-scott-ft-hoang-duyen.XcGwMI0TvUez.html">Heaven</form:option>
                    </form:select>
                </td>
                <td>
                    <button type="submit">Submit</button>
                </td>
            </tr>
        </div>
    </table>
</form:form>


<h2>${message}</h2>

<table class="table">
    <thead>
    <tr>
        <td scope="col">Tên bài hát</td>
        <td scope="col">Nghệ sĩ thể hiện</td>
        <td scope="col">hể loại nhạc</td>
        <td scope="col">ĐƯờng dẫn file bài hát
        </th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${upload.nameSong}</td>
        <td>${upload.nameSinger}</td>
        <td>${upload.categorySong}</td>
        <td>${upload.fileSong}</td>
    </tr>
    </tbody>
</table>

</body>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</html>
