<?php
session_start();

// Daftar default
$defaultList = [
  ["judul" => "Attack on Titan", "status" => "Sudah Ditonton"],
  ["judul" => "One Piece", "status" => "Sedang Ditonton"],
  ["judul" => "Solo Leveling", "status" => "Planning"],
  ["judul" => "Boruto", "status" => "Dropped"]
];

// Inisialisasi
if (!isset($_SESSION['list'])) $_SESSION['list'] = $defaultList;

// Fungsi tambah anime
function tambahAnime(&$list, $judul, $status) {
  $list[] = ["judul" => $judul, "status" => $status];
}

// Tambah atau reset
if (isset($_POST['submit'])) {
    tambahAnime($_SESSION['list'], $_POST['judul'], $_POST['status']);
    header("Location: " . $_SERVER['PHP_SELF']);
    exit;
}



if (isset($_POST['reset'])) {
  $_SESSION['list'] = $defaultList;
  header("Location: index.php");
  exit;
}
?>
<!DOCTYPE html>
<html lang="id">
<head>
  <meta charset="UTF-8">
  <title> My Anime List</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <div class="container">
    <header>
      <h1> My Anime List </h1>
    </header>

    <section class="form-section">
      <form method="POST" id="animeForm">
        <input type="text" name="judul" placeholder="Masukkan judul anime..." required>
        <select name="status" required>
          <option value="">-- Pilih Status --</option>
          <option value="Sedang Ditonton">Sedang Ditonton</option>
          <option value="Sudah Ditonton">Sudah Ditonton</option>
          <option value="Planning">Planning</option>
          <option value="Dropped">Dropped</option>
        </select>
        <div class="buttons">
          <button type="submit" name="submit" class="btn add">Tambah</button>
          <button type="submit" name="reset" formnovalidate class="btn reset">Reset</button>
        </div>
      </form>
    </section>

    <section class="list-section">
      <h2>My List</h2>
      <ul id="animeList">
        <?php foreach ($_SESSION['list'] as $anime): ?>
          <li class="anime-item">
            <span class="judul"><?= htmlspecialchars($anime['judul']) ?></span>
            <span class="status"><?= htmlspecialchars($anime['status']) ?></span>
          </li>
        <?php endforeach; ?>
      </ul>
    </section>

    <footer>
    </footer>
  </div>

  <script src="script.js"></script>
</body>
</html>
