document.getElementById('cadastrar').addEventListener('click', function() {
    document.getElementById('conteudo').innerHTML = 'Formulário de cadastro de livro';
});

document.getElementById('listar').addEventListener('click', function() {
    document.getElementById('conteudo').innerHTML = 'Lista de livros';
});

document.getElementById('emprestar').addEventListener('click', function() {
    document.getElementById('conteudo').innerHTML = 'Formulário de empréstimo de livro';
});

document.getElementById('devolver').addEventListener('click', function() {
    document.getElementById('conteudo').innerHTML = 'Formulário de devolução de livro';
});