$(document).ready(function () {
    $(".carryon_detail_box").click(function () {
        window.location = $(this).find("a").attr("href");
        return false;
    });
});