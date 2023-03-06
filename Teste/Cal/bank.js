
        // Função para calcular o resultado da operação
        function calcular(num1, num2, operacao) {
            switch (operacao) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    return num1 / num2;
                default:
                    return NaN;
            }
        }

        // Função para processar o botão de calcular
        function calcularResultado() {
            // Obtém os valores dos campos do formulário
            var num1 = parseFloat(document.getElementById("num1").value);
            var num2 = parseFloat(document.getElementById("num2").value);
            var operacao = document.getElementById("operacao").value;

            // Calcula o resultado da operação
            var resultado = calcular(num1, num2, operacao);

            // Exibe o resultado na página HTML
            document.getElementById("resultado").innerHTML = resultado;
        }