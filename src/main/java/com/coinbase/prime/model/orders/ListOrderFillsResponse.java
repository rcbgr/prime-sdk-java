/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.prime.model.orders;

import com.coinbase.prime.model.common.Pagination;

public class ListOrderFillsResponse {
    private OrderFill[] fills;
    private Pagination pagination;

    public ListOrderFillsResponse() {
    }

    public ListOrderFillsResponse(Builder builder) {
        this.fills = builder.fills;
        this.pagination = builder.pagination;
    }

    public OrderFill[] getFills() {
        return fills;
    }

    public void setFills(OrderFill[] fills) {
        this.fills = fills;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public static class Builder {
        private OrderFill[] fills;
        private Pagination pagination;

        public Builder() {
        }

        public Builder fills(OrderFill[] fills) {
            this.fills = fills;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public ListOrderFillsResponse build() {
            return new ListOrderFillsResponse(this);
        }
    }
}
