<?php
$rentDate = $_POST['rentDate'];
$renterName = $_POST['renterName'];
$jk = $_POST['jk'];
$carID = $_POST['carID'];
$durationService = $_POST['durationService'];

$carsAvailabe = [
    "M001" => ["nama" => "Innova", "tarif" => 200000],
    "M002" => ["nama" => "BYD", "tarif" => 400000],
    "M003" => ["nama" => "Avanza", "tarif" => 250000],
    "M004" => ["nama" => "Pajero", "tarif" => 500000],
    "M005" => ["nama" => "Ionic", "tarif" => 450000]
];

// untuk memeriksa Apakah null atau tidak lalu menentukannya  
$rentPrice = isset($carsAvailabe[$carID]) ? $carsAvailabe[$carID]['tarif'] : 0;
$carName = isset($carsAvailabe[$carID]) ? $carsAvailabe[$carID]['nama'] : '-';

$totalPrice = $rentPrice * $durationService;

$discount = "";

// Fungsi Menghitung Discount
function calculateDiscount($total, $duration) {
    if ($duration > 3) {
        return $total * 0.2;
    } else {
        return 0;
    }
}
// untuk Diskonnya berapa persen
if ($durationService > 3){
    $discount = "20%";
}
$totaldiscount = calculateDiscount($totalPrice, $durationService);
$finalPrice = $totalPrice - $totaldiscount;
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Struk Rental Pak Hambali</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="outputContainer">
    <h3>STRUK RENTAL PAK HAMBALI</h3>
    <label>Tanggal Rental : <?= $rentDate ?></label><br>
    <label>Nama Pemesan   : <?= $renterName ?></label><br>
    <label>Jenis Kelamin  : <?= $jk ?></label><br>
    <label>Pilihan Mobil  : <?= $carName ?></label><br>
    <label>Tarif / Hari   : Rp <?= $rentPrice ?></label><br>
    <label>Durasi Sewa    : <?= $durationService ?> hari</label><br>
    <hr>
    <label>Diskon         : Rp <?= $discount ?></label><br>
    <label>Total Bayar    : Rp <?= $finalPrice ?></label><br>
</div>
</body>
</html>
